import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-196), (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-161) + "'", int2 == (-161));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '4', 1.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.cos();
        double double5 = complex2.getImaginary();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-1940L), 2.1374372857070614E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1939.9999999999998d) + "'", double2 == (-1939.9999999999998d));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        boolean boolean3 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex4 = complex1.tan();
        boolean boolean5 = complex1.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 416, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7636230357325239d + "'", double2 == 0.7636230357325239d);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex29.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1079525376, 1.0333147966386297E40d);
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math.complex.Complex complex8 = complex4.divide(complex5);
        org.apache.commons.math.complex.Complex complex9 = complex4.asin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        boolean boolean15 = complex14.isInfinite();
        org.apache.commons.math.complex.Complex complex16 = complex4.multiply(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex4.tan();
        boolean boolean18 = complex3.equals((java.lang.Object) complex4);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        double[] doubleArray0 = null;
        int int1 = org.apache.commons.math.util.MathUtils.hash(doubleArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(197);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(970, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(544009624, 15520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543994104 + "'", int2 == 543994104);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex22.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex22.exp();
        org.apache.commons.math.complex.Complex complex27 = complex17.pow(complex22);
        boolean boolean28 = complex14.equals((java.lang.Object) complex17);
        org.apache.commons.math.complex.Complex complex29 = complex17.acos();
        org.apache.commons.math.complex.Complex complex30 = complex8.add(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.conjugate();
        org.apache.commons.math.complex.Complex complex33 = complex31.exp();
        org.apache.commons.math.complex.Complex complex34 = complex33.tan();
        org.apache.commons.math.complex.Complex complex35 = complex33.sqrt1z();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex38 = complex35.pow(complex36);
        org.apache.commons.math.complex.Complex complex39 = complex35.exp();
        org.apache.commons.math.complex.Complex complex40 = complex29.multiply(complex35);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 0L, 0.0d);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math.complex.Complex complex23 = complex22.tan();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex24.pow(complex25);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex29.exp();
        org.apache.commons.math.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math.complex.Complex complex33 = complex31.sqrt1z();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex33.exp();
        org.apache.commons.math.complex.Complex complex38 = complex28.pow(complex33);
        boolean boolean39 = complex25.equals((java.lang.Object) complex28);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex25.multiply(complex41);
        boolean boolean43 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex44 = complex5.multiply(complex25);
        org.apache.commons.math.complex.Complex complex45 = complex5.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        double double2 = org.apache.commons.math.util.MathUtils.log(97.00000000000001d, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0066581708938198d + "'", double2 == 1.0066581708938198d);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex5.asin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex8.cos();
        org.apache.commons.math.complex.Complex complex11 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math.complex.Complex complex16 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math.complex.Complex complex23 = complex22.tan();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        boolean boolean28 = complex18.equals((java.lang.Object) complex26);
        org.apache.commons.math.complex.Complex complex29 = complex18.cos();
        org.apache.commons.math.complex.Complex complex30 = complex10.divide(complex18);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex31.cos();
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        double double35 = complex34.getReal();
        org.apache.commons.math.complex.Complex complex36 = complex18.add(complex34);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.8414709848078965d + "'", double35 == 0.8414709848078965d);
        org.junit.Assert.assertNotNull(complex36);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-98), (-26));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex1.exp();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex5.exp();
        org.apache.commons.math.complex.Complex complex10 = complex0.pow(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex12.tan();
        org.apache.commons.math.complex.Complex complex16 = complex12.negate();
        org.apache.commons.math.complex.Complex complex17 = complex12.tan();
        org.apache.commons.math.complex.Complex complex18 = complex10.divide(complex17);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex0.negate();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.INF;
        double double5 = complex4.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = complex4.tan();
        org.apache.commons.math.complex.Complex complex7 = complex0.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex0.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.POSITIVE_INFINITY + "'", double5 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex8.tan();
        org.apache.commons.math.complex.Complex complex12 = complex8.negate();
        org.apache.commons.math.complex.Complex complex13 = complex6.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex3.pow(complex6);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex6.add(complex16);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex5 = complex3.multiply(complex4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(15521, 970);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 70, (int) (byte) 1, (-161));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 4, (double) 1672897382L);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 1, (-1604784744));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.cos();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        int int1 = org.apache.commons.math.util.MathUtils.hash(9.434787105502285E72d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1617463493) + "'", int1 == (-1617463493));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        double[] doubleArray4 = new double[] { 1.3440585709080678E43d, (-4.9E-324d), 97, 10.0d };
        double[] doubleArray11 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int12 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray4, doubleArray11);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.3440585709080678E43, -4.9E-324, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1672897414 + "'", int12 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-399154522) + "'", int14 == (-399154522));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = complex0.sin();
        double double7 = complex6.getImaginary();
        double double8 = complex6.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(9700, (-399154522));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-399144822) + "'", int2 == (-399144822));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex4.multiply(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex7.asin();
        boolean boolean10 = complex7.equals((java.lang.Object) 970);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex11.exp();
        org.apache.commons.math.complex.Complex complex14 = complex13.tan();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt1z();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex15.pow(complex16);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex19.exp();
        org.apache.commons.math.complex.Complex complex22 = complex21.tan();
        org.apache.commons.math.complex.Complex complex23 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex23.pow(complex24);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math.complex.Complex complex29 = complex27.exp();
        org.apache.commons.math.complex.Complex complex30 = complex29.tan();
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex31.pow(complex32);
        org.apache.commons.math.complex.Complex complex35 = complex34.acos();
        org.apache.commons.math.complex.Complex complex36 = complex34.tan();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.conjugate();
        org.apache.commons.math.complex.Complex complex39 = complex37.exp();
        org.apache.commons.math.complex.Complex complex40 = complex39.tan();
        org.apache.commons.math.complex.Complex complex41 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex41.multiply(complex43);
        boolean boolean45 = complex43.isNaN();
        double double46 = complex43.getImaginary();
        org.apache.commons.math.complex.Complex complex47 = complex34.multiply(complex43);
        org.apache.commons.math.complex.Complex complex48 = complex23.subtract(complex34);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex50 = complex23.pow(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex15.subtract(complex23);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = complex52.conjugate();
        org.apache.commons.math.complex.Complex complex54 = complex52.exp();
        org.apache.commons.math.complex.Complex complex55 = complex54.tan();
        org.apache.commons.math.complex.Complex complex56 = complex54.sqrt1z();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex58 = complex57.cosh();
        org.apache.commons.math.complex.Complex complex59 = complex56.pow(complex57);
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex62 = complex61.conjugate();
        org.apache.commons.math.complex.Complex complex63 = complex61.exp();
        org.apache.commons.math.complex.Complex complex64 = complex63.tan();
        org.apache.commons.math.complex.Complex complex65 = complex63.sqrt1z();
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex67 = complex66.cosh();
        org.apache.commons.math.complex.Complex complex68 = complex65.pow(complex66);
        org.apache.commons.math.complex.Complex complex69 = complex65.exp();
        org.apache.commons.math.complex.Complex complex70 = complex60.pow(complex65);
        boolean boolean71 = complex57.equals((java.lang.Object) complex60);
        org.apache.commons.math.complex.Complex complex72 = complex60.acos();
        org.apache.commons.math.complex.Complex complex73 = complex51.add(complex72);
        org.apache.commons.math.complex.Complex complex74 = complex72.sqrt();
        org.apache.commons.math.complex.Complex complex75 = complex7.subtract(complex74);
        org.apache.commons.math.complex.Complex complex76 = complex7.negate();
        boolean boolean78 = complex76.equals((java.lang.Object) (-1604784744));
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex3.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(complex16);
        boolean boolean18 = complex16.isNaN();
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.multiply(complex16);
        org.apache.commons.math.complex.Complex complex21 = complex20.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1), 0.6931471805599453d);
        double double3 = complex2.getImaginary();
        org.apache.commons.math.complex.Complex complex4 = complex2.log();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6931471805599453d + "'", double3 == 0.6931471805599453d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt1z();
        boolean boolean9 = complex8.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 98.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189854738044024E42d + "'", double1 == 1.8189854738044024E42d);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        org.apache.commons.math.complex.Complex complex3 = complex2.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(complex16);
        boolean boolean18 = complex16.isNaN();
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.multiply(complex16);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex21.exp();
        org.apache.commons.math.complex.Complex complex24 = complex23.tan();
        org.apache.commons.math.complex.Complex complex25 = complex23.sqrt1z();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex25.pow(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex28.acos();
        org.apache.commons.math.complex.Complex complex30 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex7.pow(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex30.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        float float2 = org.apache.commons.math.util.MathUtils.round(Float.NaN, (int) (byte) 0);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((-1072693196L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex14 = complex10.exp();
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex10);
        org.apache.commons.math.complex.Complex complex16 = complex4.subtract(complex10);
        double double17 = complex10.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(197, 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(15.104412573075518d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.10441257307552d + "'", double2 == 15.10441257307552d);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (short) 100, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.sin();
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex8);
        double double10 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex1.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(Float.NaN);
        org.junit.Assert.assertTrue(Float.isNaN(float1));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(2118354260L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2118354262L + "'", long2 == 2118354262L);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = complex0.sin();
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1072693196L), (-1072693247L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2145386443L) + "'", long2 == (-2145386443L));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.log();
        org.apache.commons.math.complex.Complex complex7 = complex2.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex2.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        double[] doubleArray6 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray15 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray15);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int21 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1672897414 + "'", int7 == 1672897414);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1672897414 + "'", int8 == 1672897414);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1672897414 + "'", int16 == 1672897414);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1672897414 + "'", int17 == 1672897414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1672897414 + "'", int18 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1672897414 + "'", int20 == 1672897414);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1672897414 + "'", int21 == 1672897414);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        boolean boolean16 = complex6.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex17 = complex6.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (short) 10, (-9), (-399154522));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        boolean boolean30 = complex15.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(complex16);
        boolean boolean18 = complex16.isNaN();
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.multiply(complex16);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex16.pow(complex23);
        org.apache.commons.math.complex.Complex complex27 = new org.apache.commons.math.complex.Complex((double) '4', 1.0d);
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex27.negate();
        org.apache.commons.math.complex.Complex complex30 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex23.subtract(complex27);
        org.apache.commons.math.complex.Complex complex32 = complex27.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex4.exp();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex10.cos();
        org.apache.commons.math.complex.Complex complex12 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        boolean boolean14 = complex4.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 10, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(97, 15520);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex8.exp();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (-1072693248), (-1072693248L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2145386496L) + "'", long2 == (-2145386496L));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex22 = complex5.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex24.cos();
        org.apache.commons.math.complex.Complex complex27 = complex23.divide(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex23.log();
        org.apache.commons.math.complex.Complex complex29 = complex23.sin();
        org.apache.commons.math.complex.Complex complex30 = complex23.atan();
        org.apache.commons.math.complex.Complex complex31 = complex22.subtract(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex30.sin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex35 = complex33.sqrt();
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt1z();
        org.apache.commons.math.complex.Complex complex38 = complex32.pow(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex38.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) -1, 3628800.0d);
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(9700, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 76.68975838114399d + "'", double2 == 76.68975838114399d);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        org.apache.commons.math.complex.Complex complex4 = complex3.asin();
        boolean boolean5 = complex3.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round(15520.0d, 1672897424);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex3.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex16.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex14.pow(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex10.subtract(complex14);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 0, (-212393252808L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 98L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 9);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        double double1 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.apache.commons.math.complex.Complex complex9 = complex2.multiply(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex2.cos();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex19.exp();
        org.apache.commons.math.complex.Complex complex22 = complex19.tan();
        org.apache.commons.math.complex.Complex complex23 = complex19.negate();
        org.apache.commons.math.complex.Complex complex24 = complex17.divide(complex19);
        org.apache.commons.math.complex.Complex complex25 = complex14.pow(complex17);
        org.apache.commons.math.complex.Complex complex26 = complex10.add(complex17);
        java.lang.Class<?> wildcardClass27 = complex26.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-10), 1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = complex2.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-9), 1070);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex4.multiply(complex6);
        double double8 = complex6.getReal();
        double double9 = complex6.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(98);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math.complex.Complex complex20 = complex19.tan();
        org.apache.commons.math.complex.Complex complex21 = complex19.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex10.add(complex22);
        boolean boolean26 = complex22.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, (-9));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-206), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(970, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(10, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-1939.9999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(0.6931471805599453d, (double) 37);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-161));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1045661013, (-1072693248));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.cos();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        double double4 = complex3.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 1079525376);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) '#', (long) 1672897424);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1672897389L) + "'", long2 == (-1672897389L));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-970L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(197, (-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        double double2 = complex1.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex30.exp();
        org.apache.commons.math.complex.Complex complex33 = complex32.tan();
        org.apache.commons.math.complex.Complex complex34 = complex32.sqrt1z();
        org.apache.commons.math.complex.Complex complex35 = complex34.conjugate();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex15.pow(complex35);
        org.apache.commons.math.complex.Complex complex38 = complex15.sqrt();
        double double39 = complex38.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(4, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.0E9d, (double) 15521);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15520.045104146004d + "'", double2 == 15520.045104146004d);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = complex0.sin();
        org.apache.commons.math.complex.Complex complex7 = complex0.atan();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex14 = complex10.exp();
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex10);
        org.apache.commons.math.complex.Complex complex16 = complex4.subtract(complex10);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        boolean boolean20 = complex19.isInfinite();
        org.apache.commons.math.complex.Complex complex21 = complex19.tan();
        org.apache.commons.math.complex.Complex complex22 = complex10.pow(complex19);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(70, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) '4', (double) (-1617463493));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1551600L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-970L), 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(99.33061245478744d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.33061245478743d + "'", double2 == 99.33061245478743d);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        org.apache.commons.math.complex.Complex complex13 = complex11.tan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex18.multiply(complex20);
        boolean boolean22 = complex20.isNaN();
        double double23 = complex20.getImaginary();
        org.apache.commons.math.complex.Complex complex24 = complex11.multiply(complex20);
        boolean boolean25 = complex1.equals((java.lang.Object) complex20);
        boolean boolean26 = complex20.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(11013.232874703392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.sin();
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex9.negate();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex11.exp();
        org.apache.commons.math.complex.Complex complex14 = complex13.log();
        org.apache.commons.math.complex.Complex complex15 = complex14.asin();
        org.apache.commons.math.complex.Complex complex16 = complex10.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex15.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-970L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 1072692225L, (-0.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(416, (-10));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.apache.commons.math.complex.Complex complex9 = complex2.multiply(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex16.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex20.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        org.apache.commons.math.complex.Complex complex27 = complex26.tan();
        org.apache.commons.math.complex.Complex complex28 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex28.pow(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex31.acos();
        org.apache.commons.math.complex.Complex complex33 = complex31.tan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.conjugate();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex36.tan();
        org.apache.commons.math.complex.Complex complex38 = complex36.sqrt1z();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex38.multiply(complex40);
        boolean boolean42 = complex40.isNaN();
        double double43 = complex40.getImaginary();
        org.apache.commons.math.complex.Complex complex44 = complex31.multiply(complex40);
        org.apache.commons.math.complex.Complex complex45 = complex20.subtract(complex31);
        org.apache.commons.math.complex.Complex complex46 = complex14.subtract(complex31);
        org.apache.commons.math.complex.Complex complex47 = complex10.subtract(complex31);
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8414709848078965d + "'", double11 == 0.8414709848078965d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.negate();
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex4);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex11.cos();
        org.apache.commons.math.complex.Complex complex14 = complex10.divide(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex10.asin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex16.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        boolean boolean21 = complex20.isInfinite();
        org.apache.commons.math.complex.Complex complex22 = complex10.multiply(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex10.tan();
        org.apache.commons.math.complex.Complex complex24 = complex4.multiply(complex10);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(100.0d, (double) 32L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex18.pow(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.acos();
        org.apache.commons.math.complex.Complex complex23 = complex21.tan();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        org.apache.commons.math.complex.Complex complex27 = complex26.tan();
        org.apache.commons.math.complex.Complex complex28 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex28.multiply(complex30);
        boolean boolean32 = complex30.isNaN();
        double double33 = complex30.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex21.multiply(complex30);
        org.apache.commons.math.complex.Complex complex35 = complex10.subtract(complex21);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex37 = complex10.pow(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex36.sqrt1z();
        boolean boolean39 = complex5.equals((java.lang.Object) complex36);
        org.apache.commons.math.complex.Complex complex40 = complex36.cos();
        org.apache.commons.math.complex.Complex complex41 = complex40.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 362880.0d + "'", double1 == 362880.0d);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-26), (double) 544009624);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.440096247087942E8d + "'", double2 == 5.440096247087942E8d);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1045661013, 288);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-970L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        double[] doubleArray5 = new double[] { 2, 1672897414, 98, 92.13617560368711d, (short) 0 };
        double[] doubleArray12 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        boolean boolean15 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray12);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double[] doubleArray22 = new double[] { 2, 1672897414, 98, 92.13617560368711d, (short) 0 };
        double[] doubleArray29 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray29);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray29);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equals(doubleArray22, doubleArray29);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[2.0, 1.672897414E9, 98.0, 92.13617560368711, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1672897414 + "'", int13 == 1672897414);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1672897414 + "'", int14 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1672897414 + "'", int16 == 1672897414);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[2.0, 1.672897414E9, 98.0, 92.13617560368711, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1672897414 + "'", int30 == 1672897414);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1672897414 + "'", int31 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) ' ', 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1045661013);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(1.0158864323725563E10d, (double) (-210271490675L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.negate();
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex4);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex12.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex2.pow(complex12);
        org.apache.commons.math.complex.Complex complex22 = complex2.asin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex4.acos();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex7.exp();
        org.apache.commons.math.complex.Complex complex10 = complex7.tan();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex11.exp();
        org.apache.commons.math.complex.Complex complex14 = complex13.tan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex17 = complex15.exp();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        org.apache.commons.math.complex.Complex complex19 = complex17.sqrt1z();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex22 = complex19.pow(complex20);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex25 = complex23.exp();
        org.apache.commons.math.complex.Complex complex26 = complex25.tan();
        org.apache.commons.math.complex.Complex complex27 = complex25.sqrt1z();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.cosh();
        org.apache.commons.math.complex.Complex complex30 = complex27.pow(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex30.acos();
        org.apache.commons.math.complex.Complex complex32 = complex30.tan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.conjugate();
        org.apache.commons.math.complex.Complex complex35 = complex33.exp();
        org.apache.commons.math.complex.Complex complex36 = complex35.tan();
        org.apache.commons.math.complex.Complex complex37 = complex35.sqrt1z();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = complex37.multiply(complex39);
        boolean boolean41 = complex39.isNaN();
        double double42 = complex39.getImaginary();
        org.apache.commons.math.complex.Complex complex43 = complex30.multiply(complex39);
        org.apache.commons.math.complex.Complex complex44 = complex19.subtract(complex30);
        org.apache.commons.math.complex.Complex complex45 = complex13.subtract(complex30);
        boolean boolean46 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex47 = complex10.subtract(complex13);
        org.apache.commons.math.complex.Complex complex48 = complex4.divide(complex47);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex51 = complex50.cosh();
        org.apache.commons.math.complex.Complex complex52 = complex50.cos();
        org.apache.commons.math.complex.Complex complex53 = complex49.divide(complex50);
        org.apache.commons.math.complex.Complex complex54 = complex49.asin();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex55.conjugate();
        org.apache.commons.math.complex.Complex complex57 = complex55.exp();
        org.apache.commons.math.complex.Complex complex58 = complex57.tan();
        org.apache.commons.math.complex.Complex complex59 = complex57.sqrt1z();
        boolean boolean60 = complex59.isInfinite();
        org.apache.commons.math.complex.Complex complex61 = complex49.multiply(complex59);
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex63 = complex62.cosh();
        org.apache.commons.math.complex.Complex complex64 = complex62.sqrt();
        org.apache.commons.math.complex.Complex complex65 = complex64.atan();
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex67 = complex66.conjugate();
        org.apache.commons.math.complex.Complex complex68 = complex66.exp();
        org.apache.commons.math.complex.Complex complex69 = complex68.tan();
        org.apache.commons.math.complex.Complex complex70 = complex68.sqrt1z();
        org.apache.commons.math.complex.Complex complex71 = complex70.conjugate();
        org.apache.commons.math.complex.Complex complex72 = complex64.pow(complex71);
        org.apache.commons.math.complex.Complex complex73 = complex71.cosh();
        org.apache.commons.math.complex.Complex complex74 = complex59.add(complex71);
        org.apache.commons.math.complex.Complex complex75 = complex74.sqrt();
        org.apache.commons.math.complex.Complex complex76 = complex47.add(complex74);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.negate();
        org.apache.commons.math.complex.Complex complex9 = complex4.tan();
        boolean boolean10 = complex2.equals((java.lang.Object) complex9);
        org.apache.commons.math.complex.Complex complex11 = complex9.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-1604784744));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        int int1 = org.apache.commons.math.util.MathUtils.hash(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1055123539) + "'", int1 == (-1055123539));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-196), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-196.0f) + "'", float2 == (-196.0f));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.cos();
        boolean boolean8 = complex4.equals((java.lang.Object) 970);
        org.apache.commons.math.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex11 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex4.pow(complex15);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math.complex.Complex complex16 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math.complex.Complex complex21 = complex19.tan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex22.exp();
        org.apache.commons.math.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex26.multiply(complex28);
        boolean boolean30 = complex28.isNaN();
        double double31 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex32 = complex19.multiply(complex28);
        org.apache.commons.math.complex.Complex complex33 = complex8.subtract(complex19);
        org.apache.commons.math.complex.Complex complex34 = complex2.subtract(complex19);
        org.apache.commons.math.complex.Complex complex35 = complex2.exp();
        org.apache.commons.math.complex.Complex complex36 = complex2.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.negate();
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex4);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex12.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex2.pow(complex12);
        org.apache.commons.math.complex.Complex complex22 = complex21.sinh();
        org.apache.commons.math.complex.Complex complex23 = complex22.asin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.sin();
        double double9 = complex6.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(1672897382L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1672897382L + "'", long2 == 1672897382L);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1672897382L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(416);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2096.6995497524968d + "'", double1 == 2096.6995497524968d);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex8.cos();
        org.apache.commons.math.complex.Complex complex11 = complex7.divide(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex6.subtract(complex7);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = complex17.multiply(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex20.asin();
        boolean boolean23 = complex20.equals((java.lang.Object) 970);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        org.apache.commons.math.complex.Complex complex27 = complex26.tan();
        org.apache.commons.math.complex.Complex complex28 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex28.pow(complex29);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex34.tan();
        org.apache.commons.math.complex.Complex complex36 = complex34.sqrt1z();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex36.pow(complex37);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.conjugate();
        org.apache.commons.math.complex.Complex complex42 = complex40.exp();
        org.apache.commons.math.complex.Complex complex43 = complex42.tan();
        org.apache.commons.math.complex.Complex complex44 = complex42.sqrt1z();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math.complex.Complex complex47 = complex44.pow(complex45);
        org.apache.commons.math.complex.Complex complex48 = complex47.acos();
        org.apache.commons.math.complex.Complex complex49 = complex47.tan();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex51 = complex50.conjugate();
        org.apache.commons.math.complex.Complex complex52 = complex50.exp();
        org.apache.commons.math.complex.Complex complex53 = complex52.tan();
        org.apache.commons.math.complex.Complex complex54 = complex52.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex56 = complex55.atan();
        org.apache.commons.math.complex.Complex complex57 = complex54.multiply(complex56);
        boolean boolean58 = complex56.isNaN();
        double double59 = complex56.getImaginary();
        org.apache.commons.math.complex.Complex complex60 = complex47.multiply(complex56);
        org.apache.commons.math.complex.Complex complex61 = complex36.subtract(complex47);
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex63 = complex36.pow(complex62);
        org.apache.commons.math.complex.Complex complex64 = complex28.subtract(complex36);
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex66 = complex65.conjugate();
        org.apache.commons.math.complex.Complex complex67 = complex65.exp();
        org.apache.commons.math.complex.Complex complex68 = complex67.tan();
        org.apache.commons.math.complex.Complex complex69 = complex67.sqrt1z();
        org.apache.commons.math.complex.Complex complex70 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex71 = complex70.cosh();
        org.apache.commons.math.complex.Complex complex72 = complex69.pow(complex70);
        org.apache.commons.math.complex.Complex complex73 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex74 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex75 = complex74.conjugate();
        org.apache.commons.math.complex.Complex complex76 = complex74.exp();
        org.apache.commons.math.complex.Complex complex77 = complex76.tan();
        org.apache.commons.math.complex.Complex complex78 = complex76.sqrt1z();
        org.apache.commons.math.complex.Complex complex79 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex80 = complex79.cosh();
        org.apache.commons.math.complex.Complex complex81 = complex78.pow(complex79);
        org.apache.commons.math.complex.Complex complex82 = complex78.exp();
        org.apache.commons.math.complex.Complex complex83 = complex73.pow(complex78);
        boolean boolean84 = complex70.equals((java.lang.Object) complex73);
        org.apache.commons.math.complex.Complex complex85 = complex73.acos();
        org.apache.commons.math.complex.Complex complex86 = complex64.add(complex85);
        org.apache.commons.math.complex.Complex complex87 = complex85.sqrt();
        org.apache.commons.math.complex.Complex complex88 = complex20.subtract(complex87);
        org.apache.commons.math.complex.Complex complex89 = complex88.acos();
        org.apache.commons.math.complex.Complex complex90 = complex7.pow(complex88);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertNotNull(complex90);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.cos();
        boolean boolean8 = complex4.equals((java.lang.Object) 970);
        org.apache.commons.math.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex11.exp();
        org.apache.commons.math.complex.Complex complex14 = complex11.tan();
        org.apache.commons.math.complex.Complex complex15 = complex11.negate();
        org.apache.commons.math.complex.Complex complex16 = complex11.tan();
        org.apache.commons.math.complex.Complex complex17 = complex4.add(complex16);
        boolean boolean18 = complex4.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.cos();
        boolean boolean8 = complex4.equals((java.lang.Object) 970);
        org.apache.commons.math.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex11.exp();
        org.apache.commons.math.complex.Complex complex14 = complex11.tan();
        org.apache.commons.math.complex.Complex complex15 = complex11.negate();
        org.apache.commons.math.complex.Complex complex16 = complex11.tan();
        org.apache.commons.math.complex.Complex complex17 = complex4.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex17.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1940L), (-1940L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3880L) + "'", long2 == (-3880L));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex3.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex3.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(complex16);
        boolean boolean18 = complex16.isNaN();
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.multiply(complex16);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex16.pow(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.cos();
        double double3 = complex0.abs();
        org.apache.commons.math.complex.Complex complex4 = complex0.exp();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(98L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-1072693296L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1672897414);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '4', 1.0d);
        boolean boolean3 = complex2.isNaN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.sin();
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        boolean boolean11 = complex8.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        double double1 = org.apache.commons.math.util.MathUtils.sign(15.120308601070285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.asin();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        org.apache.commons.math.complex.Complex complex9 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex10 = complex5.multiply(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 1672897424);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(9.434787105502285E72d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex6.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 24L, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7245267751622539d + "'", double2 == 0.7245267751622539d);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        int int1 = org.apache.commons.math.util.MathUtils.hash(5.166573983193148E39d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1601773374) + "'", int1 == (-1601773374));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex2.tan();
        org.apache.commons.math.complex.Complex complex5 = complex2.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex21.cos();
        org.apache.commons.math.complex.Complex complex24 = complex20.divide(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex24.negate();
        org.apache.commons.math.complex.Complex complex26 = complex8.divide(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex30 = complex28.exp();
        org.apache.commons.math.complex.Complex complex31 = complex30.tan();
        org.apache.commons.math.complex.Complex complex32 = complex30.sqrt1z();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex35 = complex32.pow(complex33);
        org.apache.commons.math.complex.Complex complex36 = complex32.exp();
        org.apache.commons.math.complex.Complex complex37 = complex27.pow(complex32);
        org.apache.commons.math.complex.Complex complex38 = complex27.tanh();
        boolean boolean40 = complex38.equals((java.lang.Object) 1L);
        org.apache.commons.math.complex.Complex complex41 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex42 = complex26.pow(complex41);
        boolean boolean43 = complex41.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-9), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math.complex.Complex complex20 = complex19.tan();
        org.apache.commons.math.complex.Complex complex21 = complex19.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex21.exp();
        org.apache.commons.math.complex.Complex complex26 = complex16.pow(complex21);
        boolean boolean27 = complex13.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex29.cos();
        org.apache.commons.math.complex.Complex complex32 = complex28.divide(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex32.negate();
        org.apache.commons.math.complex.Complex complex34 = complex16.divide(complex33);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = complex36.exp();
        org.apache.commons.math.complex.Complex complex39 = complex38.tan();
        org.apache.commons.math.complex.Complex complex40 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex41.cosh();
        org.apache.commons.math.complex.Complex complex43 = complex40.pow(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex40.exp();
        org.apache.commons.math.complex.Complex complex45 = complex35.pow(complex40);
        org.apache.commons.math.complex.Complex complex46 = complex35.tanh();
        boolean boolean48 = complex46.equals((java.lang.Object) 1L);
        org.apache.commons.math.complex.Complex complex49 = complex46.sqrt1z();
        org.apache.commons.math.complex.Complex complex50 = complex34.pow(complex49);
        boolean boolean51 = complex7.equals((java.lang.Object) complex34);
        org.apache.commons.math.complex.Complex complex52 = complex34.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(complex52);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.sin();
        org.apache.commons.math.complex.Complex complex9 = complex1.pow(complex8);
        double double10 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex1.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1076101120);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex1.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math.complex.Complex complex23 = complex22.tan();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex24.pow(complex25);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex29.exp();
        org.apache.commons.math.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math.complex.Complex complex33 = complex31.sqrt1z();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex33.exp();
        org.apache.commons.math.complex.Complex complex38 = complex28.pow(complex33);
        boolean boolean39 = complex25.equals((java.lang.Object) complex28);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex25.multiply(complex41);
        boolean boolean43 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex44 = complex5.multiply(complex25);
        boolean boolean45 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex46 = complex25.cos();
        org.apache.commons.math.complex.Complex complex47 = complex46.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '4', 1.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math.complex.Complex complex5 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(2121762133, (-26));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.cos();
        double double3 = complex2.getImaginary();
        org.apache.commons.math.complex.Complex complex4 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex2.exp();
        org.apache.commons.math.complex.Complex complex6 = complex5.asin();
        java.lang.Class<?> wildcardClass7 = complex6.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 10, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex21.cos();
        org.apache.commons.math.complex.Complex complex24 = complex20.divide(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex24.negate();
        org.apache.commons.math.complex.Complex complex26 = complex8.divide(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.conjugate();
        org.apache.commons.math.complex.Complex complex29 = complex27.exp();
        org.apache.commons.math.complex.Complex complex30 = complex29.tan();
        org.apache.commons.math.complex.Complex complex31 = complex29.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex31.pow(complex32);
        org.apache.commons.math.complex.Complex complex35 = complex34.acos();
        org.apache.commons.math.complex.Complex complex36 = complex34.tan();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.conjugate();
        org.apache.commons.math.complex.Complex complex39 = complex37.exp();
        org.apache.commons.math.complex.Complex complex40 = complex39.tan();
        org.apache.commons.math.complex.Complex complex41 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = complex41.multiply(complex43);
        boolean boolean45 = complex43.isNaN();
        double double46 = complex43.getImaginary();
        org.apache.commons.math.complex.Complex complex47 = complex34.multiply(complex43);
        org.apache.commons.math.complex.Complex complex48 = complex34.negate();
        org.apache.commons.math.complex.Complex complex49 = complex26.subtract(complex34);
        org.apache.commons.math.complex.Complex complex50 = complex26.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-206), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-216) + "'", int2 == (-216));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) ' ', (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((-13.097335529232552d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.apache.commons.math.complex.Complex complex9 = complex2.multiply(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex2.cos();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex13.atan();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex18 = complex17.exp();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex19.exp();
        org.apache.commons.math.complex.Complex complex22 = complex19.tan();
        org.apache.commons.math.complex.Complex complex23 = complex19.negate();
        org.apache.commons.math.complex.Complex complex24 = complex17.divide(complex19);
        org.apache.commons.math.complex.Complex complex25 = complex14.pow(complex17);
        org.apache.commons.math.complex.Complex complex26 = complex10.add(complex17);
        double double27 = complex26.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex26.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6931471805599453d + "'", double27 == 0.6931471805599453d);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex0.tan();
        org.apache.commons.math.complex.Complex complex14 = complex0.asin();
        org.apache.commons.math.complex.Complex complex15 = complex14.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        double[] doubleArray6 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray16 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray16);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray16);
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1672897414 + "'", int7 == 1672897414);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1672897414 + "'", int8 == 1672897414);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1672897414 + "'", int9 == 1672897414);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1672897414 + "'", int17 == 1672897414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1672897414 + "'", int18 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math.complex.Complex complex23 = complex22.tan();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex24.pow(complex25);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex29.exp();
        org.apache.commons.math.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math.complex.Complex complex33 = complex31.sqrt1z();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex33.exp();
        org.apache.commons.math.complex.Complex complex38 = complex28.pow(complex33);
        boolean boolean39 = complex25.equals((java.lang.Object) complex28);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex25.multiply(complex41);
        boolean boolean43 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex44 = complex5.multiply(complex25);
        org.apache.commons.math.complex.Complex complex45 = complex25.sqrt1z();
        org.apache.commons.math.complex.Complex complex46 = complex25.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        double[] doubleArray4 = new double[] { (-1072693248L), (-2145386496L), 9.619275968248924E151d, 0L };
        int int5 = org.apache.commons.math.util.MathUtils.hash(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.072693248E9, -2.145386496E9, 9.619275968248924E151, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-36784250) + "'", int5 == (-36784250));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1079525376, 1.0333147966386297E40d);
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        boolean boolean4 = complex3.isInfinite();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex0.tan();
        boolean boolean4 = complex3.isInfinite();
        java.lang.Class<?> wildcardClass5 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(970, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex0.negate();
        org.apache.commons.math.complex.Complex complex5 = complex0.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex8.cos();
        org.apache.commons.math.complex.Complex complex11 = complex7.divide(complex8);
        org.apache.commons.math.complex.Complex complex12 = complex7.asin();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        org.apache.commons.math.complex.Complex complex16 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex17 = complex12.multiply(complex15);
        org.apache.commons.math.complex.Complex complex18 = complex5.subtract(complex12);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.8414709848078965d, (double) 98.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 95.08925059250168d + "'", double2 == 95.08925059250168d);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex5.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 10.0f, 5.166573983193148E39d);
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 288, 0.7853981633974483d);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((-196.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        double double6 = complex5.getReal();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex9.log();
        org.apache.commons.math.complex.Complex complex11 = complex7.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-1551600L), (double) (-62));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1551599.9999999998d) + "'", double2 == (-1551599.9999999998d));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(416, (-1055123539));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1055123123) + "'", int2 == (-1055123123));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-2145386443L), 15521, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) (-1604784744));
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((-62), (-399144822));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        boolean boolean16 = complex6.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex17 = complex6.cos();
        org.apache.commons.math.complex.Complex complex18 = complex6.conjugate();
        double double19 = complex18.abs();
        org.apache.commons.math.complex.Complex complex20 = complex18.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(complex20);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex22 = complex5.multiply(complex21);
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math.complex.Complex complex27 = complex21.add(complex25);
        org.apache.commons.math.complex.Complex complex28 = complex21.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex22 = complex5.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex24.cos();
        org.apache.commons.math.complex.Complex complex27 = complex23.divide(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex23.log();
        org.apache.commons.math.complex.Complex complex29 = complex23.sin();
        org.apache.commons.math.complex.Complex complex30 = complex23.atan();
        org.apache.commons.math.complex.Complex complex31 = complex22.subtract(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex30.sin();
        org.apache.commons.math.complex.Complex complex33 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.conjugate();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex34.tan();
        org.apache.commons.math.complex.Complex complex38 = complex37.sinh();
        org.apache.commons.math.complex.Complex complex39 = complex33.pow(complex37);
        double double40 = complex33.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex30.negate();
        org.apache.commons.math.complex.Complex complex34 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex35 = complex31.divide(complex34);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(2096.6995497524968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.negate();
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex4);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math.complex.Complex complex17 = complex15.exp();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        org.apache.commons.math.complex.Complex complex19 = complex12.multiply(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        double double21 = complex20.getReal();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex22.exp();
        org.apache.commons.math.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math.complex.Complex complex28 = complex26.exp();
        org.apache.commons.math.complex.Complex complex29 = complex28.tan();
        org.apache.commons.math.complex.Complex complex30 = complex28.sqrt1z();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex33 = complex30.pow(complex31);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.conjugate();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex36.tan();
        org.apache.commons.math.complex.Complex complex38 = complex36.sqrt1z();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex38.pow(complex39);
        org.apache.commons.math.complex.Complex complex42 = complex41.acos();
        org.apache.commons.math.complex.Complex complex43 = complex41.tan();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex45 = complex44.conjugate();
        org.apache.commons.math.complex.Complex complex46 = complex44.exp();
        org.apache.commons.math.complex.Complex complex47 = complex46.tan();
        org.apache.commons.math.complex.Complex complex48 = complex46.sqrt1z();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = complex48.multiply(complex50);
        boolean boolean52 = complex50.isNaN();
        double double53 = complex50.getImaginary();
        org.apache.commons.math.complex.Complex complex54 = complex41.multiply(complex50);
        org.apache.commons.math.complex.Complex complex55 = complex30.subtract(complex41);
        org.apache.commons.math.complex.Complex complex56 = complex24.subtract(complex41);
        org.apache.commons.math.complex.Complex complex57 = complex20.subtract(complex41);
        org.apache.commons.math.complex.Complex complex60 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        org.apache.commons.math.complex.Complex complex61 = complex60.sinh();
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex63 = complex62.cosh();
        org.apache.commons.math.complex.Complex complex64 = complex62.sqrt();
        org.apache.commons.math.complex.Complex complex65 = complex64.sqrt();
        org.apache.commons.math.complex.Complex complex66 = complex60.pow(complex65);
        org.apache.commons.math.complex.Complex complex67 = complex20.add(complex60);
        boolean boolean68 = complex9.equals((java.lang.Object) complex60);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.8414709848078965d + "'", double21 == 0.8414709848078965d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = complex8.acos();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex21.cos();
        double double24 = complex21.abs();
        org.apache.commons.math.complex.Complex complex25 = complex20.subtract(complex21);
        org.apache.commons.math.complex.Complex complex26 = complex21.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        double double1 = org.apache.commons.math.util.MathUtils.sign(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '4', 1.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.negate();
        org.apache.commons.math.complex.Complex complex5 = complex2.atan();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        org.apache.commons.math.complex.Complex complex3 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.exp();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex9.pow(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex18.pow(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex18.exp();
        org.apache.commons.math.complex.Complex complex23 = complex13.pow(complex18);
        boolean boolean24 = complex10.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.conjugate();
        org.apache.commons.math.complex.Complex complex27 = complex25.exp();
        org.apache.commons.math.complex.Complex complex28 = complex27.tan();
        org.apache.commons.math.complex.Complex complex29 = complex27.sqrt1z();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math.complex.Complex complex32 = complex29.pow(complex30);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.conjugate();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex36.tan();
        org.apache.commons.math.complex.Complex complex38 = complex36.sqrt1z();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex38.pow(complex39);
        org.apache.commons.math.complex.Complex complex42 = complex38.exp();
        org.apache.commons.math.complex.Complex complex43 = complex33.pow(complex38);
        boolean boolean44 = complex30.equals((java.lang.Object) complex33);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.cosh();
        org.apache.commons.math.complex.Complex complex47 = complex30.multiply(complex46);
        boolean boolean48 = complex30.isNaN();
        org.apache.commons.math.complex.Complex complex49 = complex10.multiply(complex30);
        org.apache.commons.math.complex.Complex complex50 = complex1.divide(complex49);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex5 = complex4.atan();
        org.apache.commons.math.complex.Complex complex6 = complex5.log();
        org.apache.commons.math.complex.Complex complex7 = complex2.pow(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex6.atan();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex9.tan();
        org.apache.commons.math.complex.Complex complex13 = complex9.negate();
        org.apache.commons.math.complex.Complex complex14 = complex9.tan();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        double double20 = complex19.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex19.acos();
        org.apache.commons.math.complex.Complex complex22 = complex15.subtract(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex6.divide(complex21);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.8414709848078965d + "'", double20 == 0.8414709848078965d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((-11.221255477432834d), 1074790500, (-26));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.negate();
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex4);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex12.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex2.pow(complex12);
        double double22 = complex2.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.120308601070285d + "'", double22 == 15.120308601070285d);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(4, 1505107694);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1505107698 + "'", int2 == 1505107698);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex0.negate();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex14 = complex10.exp();
        org.apache.commons.math.complex.Complex complex15 = complex5.pow(complex10);
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex15.sin();
        org.apache.commons.math.complex.Complex complex18 = complex0.multiply(complex15);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1604784744));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 2118354262L, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1072693247L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1551601L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex4.multiply(complex6);
        boolean boolean8 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        boolean boolean16 = complex6.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex17 = complex6.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = complex8.acos();
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        boolean boolean22 = complex20.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1672897389L), (long) (-161));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1672897228L) + "'", long2 == (-1672897228L));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-1072693196L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.cos();
        org.apache.commons.math.complex.Complex complex3 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex4 = complex1.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-1604784744), 0.0d);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        double double2 = org.apache.commons.math.util.MathUtils.log(9.999999999999999E8d, 99.33061245478743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2218981236957858d + "'", double2 == 0.2218981236957858d);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        double[] doubleArray5 = new double[] { 2, 1672897414, 98, 92.13617560368711d, (short) 0 };
        double[] doubleArray12 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        boolean boolean15 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray12);
        double[] doubleArray21 = new double[] { 2, 1672897414, 98, 92.13617560368711d, (short) 0 };
        double[] doubleArray28 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int29 = org.apache.commons.math.util.MathUtils.hash(doubleArray28);
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray28);
        boolean boolean31 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray28);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[2.0, 1.672897414E9, 98.0, 92.13617560368711, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1672897414 + "'", int13 == 1672897414);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1672897414 + "'", int14 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[2.0, 1.672897414E9, 98.0, 92.13617560368711, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1672897414 + "'", int29 == 1672897414);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1672897414 + "'", int30 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex6 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex7 = complex6.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex8.tan();
        org.apache.commons.math.complex.Complex complex12 = complex8.negate();
        org.apache.commons.math.complex.Complex complex13 = complex6.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex3.pow(complex6);
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math.complex.Complex complex16 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math.complex.Complex complex21 = complex19.tan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex22.exp();
        org.apache.commons.math.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex26.multiply(complex28);
        boolean boolean30 = complex28.isNaN();
        double double31 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex32 = complex19.multiply(complex28);
        org.apache.commons.math.complex.Complex complex33 = complex8.subtract(complex19);
        org.apache.commons.math.complex.Complex complex34 = complex2.subtract(complex19);
        org.apache.commons.math.complex.Complex complex35 = complex19.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.cos();
        boolean boolean3 = complex0.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        org.apache.commons.math.complex.Complex complex8 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex11.pow(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex22 = complex7.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex7.negate();
        org.apache.commons.math.complex.Complex complex24 = complex7.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math.complex.Complex complex20 = complex19.tan();
        org.apache.commons.math.complex.Complex complex21 = complex19.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex10.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex26.log();
        org.apache.commons.math.complex.Complex complex28 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = complex8.acos();
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex20.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-970), (double) (-1055123123));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(98.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-216));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(complex16);
        boolean boolean18 = complex16.isNaN();
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.multiply(complex16);
        org.apache.commons.math.complex.Complex complex21 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex7.tanh();
        double double23 = complex7.abs();
        org.apache.commons.math.complex.Complex complex24 = complex7.tan();
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1072693248 + "'", int1 == 1072693248);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        boolean boolean3 = complex2.isInfinite();
        org.apache.commons.math.complex.Complex complex4 = complex2.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(70, (-1601773374));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }
}

