import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl3.scalarMultiply((double) 100L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        double[] doubleArray26 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        boolean boolean29 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl28);
        boolean boolean30 = realMatrixImpl28.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl28.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(realMatrix31);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        java.lang.String str16 = realMatrixImpl13.toString();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double double21 = realMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double double26 = realMatrixImpl25.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.transpose();
        double[] doubleArray29 = realMatrixImpl25.getColumn(0);
        double[] doubleArray30 = realMatrixImpl20.preMultiply(doubleArray29);
        double[] doubleArray31 = realMatrixImpl13.preMultiply(doubleArray29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[][] doubleArray34 = realMatrixImpl33.getDataRef();
        double double35 = realMatrixImpl33.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl33.scalarAdd((double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str16, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double double23 = realMatrixImpl13.getNorm();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray36 = realMatrixImpl27.preMultiply(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        boolean boolean38 = realMatrixImpl37.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl37.transpose();
        int int40 = realMatrixImpl37.getColumnDimension();
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) int40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        boolean boolean51 = realMatrixImpl45.isSquare();
        int int52 = realMatrixImpl45.getColumnDimension();
        double double53 = realMatrixImpl45.getNorm();
        java.lang.String str54 = realMatrixImpl45.toString();
        boolean boolean55 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl45);
        int[] intArray56 = null;
        int[] intArray58 = new int[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl45.getSubMatrix(intArray56, intArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str54, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[35]");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[] doubleArray5 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl6.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        boolean boolean12 = realMatrixImpl6.isSquare();
        int int13 = realMatrixImpl6.getColumnDimension();
        double double14 = realMatrixImpl6.getNorm();
        boolean boolean15 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl6);
        boolean boolean16 = realMatrixImpl6.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl6.scalarMultiply((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl6.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        int int9 = realMatrixImpl8.getColumnDimension();
        double[] doubleArray11 = realMatrixImpl8.getRow((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl8.getColumnMatrix((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        int int41 = realMatrixImpl28.getColumnDimension();
        int int42 = realMatrixImpl28.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl28.scalarAdd(100.0d);
        int int45 = realMatrixImpl28.getColumnDimension();
        double[][] doubleArray46 = realMatrixImpl28.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(doubleArray46);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double double41 = realMatrixImpl7.getNorm();
        boolean boolean42 = realMatrixImpl7.isSquare();
        double[] doubleArray44 = realMatrixImpl7.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl45.inverse();
        java.lang.String str47 = realMatrixImpl45.toString();
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        double[] doubleArray59 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray60 = realMatrixImpl51.preMultiply(doubleArray59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        boolean boolean62 = realMatrixImpl61.isSquare();
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        boolean boolean72 = realMatrixImpl66.isSquare();
        int int73 = realMatrixImpl66.getColumnDimension();
        double[] doubleArray76 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        double[] doubleArray80 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl77.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl81);
        double[] doubleArray85 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray86 = realMatrixImpl77.preMultiply(doubleArray85);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        double[] doubleArray88 = realMatrixImpl66.preMultiply(doubleArray85);
        boolean boolean89 = realMatrixImpl61.equals((java.lang.Object) realMatrixImpl66);
        double[][] doubleArray90 = realMatrixImpl66.getData();
        double[][] doubleArray91 = realMatrixImpl66.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray91);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl92.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix95 = realMatrixImpl92.getRowMatrix(0);
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl45.preMultiply(realMatrix95);
        int int97 = realMatrixImpl45.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RealMatrixImpl{{1.0}}" + "'", str47, "RealMatrixImpl{{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertNotNull(realMatrix93);
        org.junit.Assert.assertNotNull(realMatrix95);
        org.junit.Assert.assertNotNull(realMatrix96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        boolean boolean10 = realMatrixImpl9.isSingular();
        java.lang.String str11 = realMatrixImpl9.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl9.scalarAdd((double) 10L);
        double[] doubleArray15 = realMatrixImpl9.getRow(0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = realMatrixImpl9.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str11, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 1L);
        double[][] doubleArray12 = realMatrixImpl3.getData();
        java.lang.String str13 = realMatrixImpl3.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str13, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray55 = realMatrixImpl29.preMultiply(doubleArray52);
        double[] doubleArray56 = realMatrixImpl7.preMultiply(doubleArray52);
        double double57 = realMatrixImpl7.getNorm();
        int int58 = realMatrixImpl7.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray42 = realMatrixImpl33.preMultiply(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        boolean boolean53 = realMatrixImpl47.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl47.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl33.subtract(realMatrix55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl10.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl7.isSquare();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        boolean boolean19 = realMatrixImpl13.isSquare();
        int int20 = realMatrixImpl13.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray33 = realMatrixImpl24.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray35 = realMatrixImpl13.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray37 = realMatrixImpl7.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.scalarMultiply(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl38.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl3.preMultiply(doubleArray22);
        boolean boolean26 = realMatrixImpl3.isSquare();
        double[][] doubleArray27 = realMatrixImpl3.getDataRef();
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[][] doubleArray37 = realMatrixImpl31.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl38.copy();
        boolean boolean40 = realMatrixImpl38.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        double[][] doubleArray42 = realMatrixImpl38.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.copy();
        // The following exception was thrown during execution in test generation
        try {
            double double44 = realMatrixImpl38.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double double37 = realMatrixImpl36.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray52 = realMatrixImpl43.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        boolean boolean54 = realMatrixImpl53.isSingular();
        double double55 = realMatrixImpl53.getNorm();
        int int56 = realMatrixImpl53.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.scalarMultiply((double) 5);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl53.getRowMatrix(1);
        double[][] doubleArray62 = realMatrixImpl53.getDataRef();
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        double[] doubleArray78 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl75.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl70.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        boolean boolean82 = realMatrixImpl70.isSquare();
        double double83 = realMatrixImpl70.getNorm();
        boolean boolean84 = realMatrixImpl70.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl70.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        boolean boolean87 = realMatrixImpl53.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double88 = realMatrixImpl53.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 11.0d + "'", double55 == 11.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[] doubleArray7 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double double9 = realMatrixImpl8.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl8.transpose();
        double[] doubleArray12 = realMatrixImpl8.getColumn(0);
        double[] doubleArray13 = realMatrixImpl3.preMultiply(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl14.transpose();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.scalarMultiply((double) (short) 100);
        java.lang.String str22 = realMatrixImpl19.toString();
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarMultiply((double) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl19.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl19.scalarMultiply(12.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl14.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str22, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix31);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double double37 = realMatrixImpl36.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl16.transpose();
        double[][] doubleArray41 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl16.scalarMultiply((double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        java.lang.String str21 = realMatrixImpl20.toString();
        boolean boolean22 = realMatrixImpl20.isSquare();
        java.lang.String str23 = realMatrixImpl20.toString();
        boolean boolean24 = realMatrixImpl20.isSquare();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str21, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str23, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        double[][] doubleArray8 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[][] doubleArray10 = realMatrixImpl9.getData();
        int int11 = realMatrixImpl9.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        boolean boolean20 = realMatrixImpl19.isSingular();
        java.lang.String str21 = realMatrixImpl19.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl19.transpose();
        java.lang.String str23 = realMatrixImpl19.toString();
        double double24 = realMatrixImpl19.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = realMatrixImpl19.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str21, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str23, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 300.0d + "'", double24 == 300.0d);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(3, (int) (short) 1);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        boolean boolean40 = realMatrixImpl39.isSingular();
        double[][] doubleArray41 = realMatrixImpl39.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        boolean boolean43 = realMatrixImpl25.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl25.scalarAdd((double) 10L);
        boolean boolean46 = realMatrixImpl18.equals((java.lang.Object) 10L);
        java.lang.Object obj47 = null;
        boolean boolean48 = realMatrixImpl18.equals(obj47);
        double[][] doubleArray49 = realMatrixImpl18.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarMultiply((double) (byte) 100);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[] doubleArray23 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray24 = realMatrixImpl15.preMultiply(doubleArray23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        boolean boolean26 = realMatrixImpl25.isSingular();
        double double27 = realMatrixImpl25.getNorm();
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(5, 10);
        double double52 = realMatrixImpl51.getNorm();
        boolean boolean53 = realMatrixImpl51.isSquare();
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        boolean boolean63 = realMatrixImpl57.isSquare();
        int int64 = realMatrixImpl57.getColumnDimension();
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        double[] doubleArray71 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl68.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        double[] doubleArray76 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray77 = realMatrixImpl68.preMultiply(doubleArray76);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        double[] doubleArray79 = realMatrixImpl57.preMultiply(doubleArray76);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl80.scalarMultiply((double) 100.0f);
        boolean boolean83 = realMatrixImpl51.equals((java.lang.Object) realMatrixImpl80);
        boolean boolean84 = realMatrixImpl51.isSquare();
        boolean boolean85 = realMatrixImpl51.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl44.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 11.0d + "'", double27 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl24.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray48 = realMatrixImpl39.preMultiply(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double double54 = realMatrixImpl53.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl53.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        double[] doubleArray68 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray69 = realMatrixImpl60.preMultiply(doubleArray68);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        boolean boolean71 = realMatrixImpl70.isSingular();
        double double72 = realMatrixImpl70.getNorm();
        int int73 = realMatrixImpl70.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl70.scalarMultiply((double) 5);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl53.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl70.getRowMatrix(1);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        double[] doubleArray82 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray82);
        double double84 = realMatrixImpl83.getNorm();
        double[] doubleArray87 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        double double89 = realMatrixImpl88.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix90 = realMatrixImpl88.transpose();
        double[] doubleArray92 = realMatrixImpl88.getColumn(0);
        double[] doubleArray93 = realMatrixImpl83.preMultiply(doubleArray92);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92);
        org.apache.commons.math.linear.RealMatrix realMatrix95 = realMatrixImpl94.transpose();
        boolean boolean96 = realMatrixImpl70.equals((java.lang.Object) realMatrixImpl94);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix98 = realMatrixImpl70.getColumnMatrix((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 11.0d + "'", double72 == 11.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 1.0d + "'", double89 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix90);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        java.lang.String str11 = realMatrixImpl10.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.transpose();
        double[][] doubleArray13 = realMatrixImpl10.getData();
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl21);
        double[] doubleArray25 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray26 = realMatrixImpl17.preMultiply(doubleArray25);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        boolean boolean28 = realMatrixImpl27.isSingular();
        double double29 = realMatrixImpl27.getNorm();
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl37.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.getRowMatrix((int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl46.copy();
        java.lang.String str53 = realMatrixImpl46.toString();
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[] doubleArray65 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray66 = realMatrixImpl57.preMultiply(doubleArray65);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        boolean boolean68 = realMatrixImpl67.isSingular();
        double[][] doubleArray69 = realMatrixImpl67.getDataRef();
        java.lang.String str70 = realMatrixImpl67.toString();
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double double75 = realMatrixImpl74.getNorm();
        double[] doubleArray78 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        double double80 = realMatrixImpl79.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl79.transpose();
        double[] doubleArray83 = realMatrixImpl79.getColumn(0);
        double[] doubleArray84 = realMatrixImpl74.preMultiply(doubleArray83);
        double[] doubleArray85 = realMatrixImpl67.preMultiply(doubleArray83);
        double[] doubleArray86 = realMatrixImpl46.preMultiply(doubleArray83);
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        int int88 = realMatrixImpl10.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str11, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 11.0d + "'", double29 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str53, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str70, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl3.preMultiply(doubleArray22);
        boolean boolean26 = realMatrixImpl3.isSquare();
        boolean boolean27 = realMatrixImpl3.isSingular();
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        boolean boolean37 = realMatrixImpl31.isSquare();
        int int38 = realMatrixImpl31.getColumnDimension();
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        double[] doubleArray50 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray51 = realMatrixImpl42.preMultiply(doubleArray50);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray53 = realMatrixImpl31.preMultiply(doubleArray50);
        double[] doubleArray54 = realMatrixImpl3.preMultiply(doubleArray50);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarMultiply((double) (short) -1);
        double double13 = realMatrixImpl3.getEntry((int) (short) 0, (int) (short) 0);
        java.lang.String str14 = realMatrixImpl3.toString();
        java.lang.String str15 = realMatrixImpl3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl3.getSubMatrix((int) (byte) 1, 1, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str14, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str15, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        double[][] doubleArray18 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl20.transpose();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl20.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.transpose();
        double double16 = realMatrixImpl13.getNorm();
        int int17 = realMatrixImpl13.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.transpose();
        boolean boolean19 = realMatrixImpl13.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 11.0d + "'", double16 == 11.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl3.copy();
        double[][] doubleArray8 = realMatrixImpl3.getDataRef();
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[][] doubleArray18 = realMatrixImpl12.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        boolean boolean20 = realMatrixImpl3.equals((java.lang.Object) doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl3.getColumnMatrix((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double double37 = realMatrixImpl36.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl16.copy();
        boolean boolean41 = realMatrixImpl16.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl16.scalarMultiply((double) (byte) 0);
        double[] doubleArray44 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = realMatrixImpl16.solve(doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray22 = realMatrixImpl7.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[] doubleArray36 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray37 = realMatrixImpl28.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray39 = realMatrixImpl24.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl40.getRowMatrix(10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        boolean boolean8 = realMatrixImpl3.isSingular();
        java.lang.String str9 = realMatrixImpl3.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 5);
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray23 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray29 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray30 = new double[][] { doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        int int33 = realMatrixImpl32.getRowDimension();
        double[][] doubleArray34 = realMatrixImpl32.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray48 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray49 = realMatrixImpl40.preMultiply(doubleArray48);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        int int53 = realMatrixImpl52.getColumnDimension();
        double[][] doubleArray54 = realMatrixImpl52.getData();
        double[][] doubleArray55 = realMatrixImpl52.getDataRef();
        double[][] doubleArray56 = realMatrixImpl52.getData();
        double[][] doubleArray57 = realMatrixImpl52.getData();
        int int58 = realMatrixImpl52.getRowDimension();
        boolean boolean59 = realMatrixImpl36.equals((java.lang.Object) int58);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl36.getColumnMatrix((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl3.add(realMatrix61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(realMatrix61);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray11 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.getColumnMatrix((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = realMatrixImpl3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSquare();
        boolean boolean22 = realMatrixImpl7.isSquare();
        double[][] doubleArray23 = realMatrixImpl7.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        int int7 = realMatrixImpl3.getRowDimension();
        int int8 = realMatrixImpl3.getColumnDimension();
        boolean boolean9 = realMatrixImpl3.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl3.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(3, (int) (short) 1);
        double[] doubleArray5 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl6.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        double[] doubleArray14 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray15 = realMatrixImpl6.preMultiply(doubleArray14);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        boolean boolean17 = realMatrixImpl16.isSingular();
        double[][] doubleArray18 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        boolean boolean20 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl2.scalarAdd((double) 10L);
        int int23 = realMatrixImpl2.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl2.getRowMatrix((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl10.copy();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl19.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        boolean boolean31 = realMatrixImpl19.isSquare();
        double double32 = realMatrixImpl19.getNorm();
        boolean boolean33 = realMatrixImpl19.isSingular();
        int int34 = realMatrixImpl19.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl19.transpose();
        double[][] doubleArray36 = realMatrixImpl19.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        realMatrixImpl10.setSubMatrix(doubleArray36, (int) (short) 0, (int) (byte) 0);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarMultiply((double) (short) 100);
        java.lang.String str47 = realMatrixImpl44.toString();
        double double48 = realMatrixImpl44.getNorm();
        java.lang.String str49 = realMatrixImpl44.toString();
        double[][] doubleArray50 = realMatrixImpl44.getData();
        boolean boolean51 = realMatrixImpl10.equals((java.lang.Object) realMatrixImpl44);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl64.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl59.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double[] doubleArray77 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl74.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl78);
        double[] doubleArray82 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray83 = realMatrixImpl74.preMultiply(doubleArray82);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl68.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl44.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl44.copy();
        double[][] doubleArray87 = realMatrixImpl44.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl44.transpose();
        boolean boolean89 = realMatrixImpl44.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str47, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str49, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.scalarAdd((double) 'a');
        int int43 = realMatrixImpl7.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl7.getRowMatrix((int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray22 = realMatrixImpl7.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[] doubleArray36 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray37 = realMatrixImpl28.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.scalarMultiply(100.0d);
        int int41 = realMatrixImpl38.getRowDimension();
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray53 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray54 = realMatrixImpl45.preMultiply(doubleArray53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        boolean boolean56 = realMatrixImpl55.isSquare();
        int int57 = realMatrixImpl55.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl55.transpose();
        double double59 = realMatrixImpl55.getTrace();
        boolean boolean60 = realMatrixImpl55.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl38.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        int int62 = realMatrixImpl55.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl55.scalarAdd((double) '4');
        double double65 = realMatrixImpl55.getTrace();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl24.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl24.scalarMultiply((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl24.getRowMatrix((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix68);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[][] doubleArray42 = realMatrixImpl18.getData();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl50.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        boolean boolean62 = realMatrixImpl50.isSquare();
        int int63 = realMatrixImpl50.getColumnDimension();
        double[] doubleArray65 = realMatrixImpl50.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl18.scalarAdd((double) (-1.0f));
        int int70 = realMatrixImpl18.getColumnDimension();
        java.lang.Class<?> wildcardClass71 = realMatrixImpl18.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.scalarAdd((double) ' ');
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl40.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[][] doubleArray45 = realMatrixImpl40.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.getColumnMatrix((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray45);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray33 = realMatrixImpl7.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        boolean boolean35 = realMatrixImpl34.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.inverse();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl34.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.getRowMatrix(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl6.getSubMatrix((int) (short) 1, (int) (byte) 0, 2, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl16.isSquare();
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double double24 = realMatrixImpl23.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl23.transpose();
        double[][] doubleArray26 = realMatrixImpl23.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarMultiply((double) (byte) 100);
        boolean boolean30 = realMatrixImpl16.equals((java.lang.Object) realMatrix29);
        java.lang.String str31 = realMatrixImpl16.toString();
        int int32 = realMatrixImpl16.getRowDimension();
        boolean boolean33 = realMatrixImpl16.isSquare();
        boolean boolean34 = realMatrixImpl16.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str31, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        boolean boolean9 = realMatrixImpl8.isSquare();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl17.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean29 = realMatrixImpl17.isSquare();
        double double30 = realMatrixImpl17.getNorm();
        boolean boolean31 = realMatrixImpl17.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl8.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = realMatrixImpl17.getRow(97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(realMatrix32);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        boolean boolean8 = realMatrixImpl3.isSingular();
        java.lang.String str9 = realMatrixImpl3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl3.getSubMatrix(2, (int) 'a', (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(3, (int) (short) 1);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        boolean boolean40 = realMatrixImpl39.isSingular();
        double[][] doubleArray41 = realMatrixImpl39.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        boolean boolean43 = realMatrixImpl25.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl25.scalarAdd((double) 10L);
        boolean boolean46 = realMatrixImpl18.equals((java.lang.Object) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl18.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl18.scalarMultiply((double) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix49);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl20.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        boolean boolean32 = realMatrixImpl20.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl20.transpose();
        double[] doubleArray36 = realMatrixImpl20.getRow((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        boolean boolean38 = realMatrixImpl37.isSquare();
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double double43 = realMatrixImpl42.getNorm();
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double double48 = realMatrixImpl47.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl47.transpose();
        double[] doubleArray51 = realMatrixImpl47.getColumn(0);
        double[] doubleArray52 = realMatrixImpl42.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl42.scalarAdd((double) (short) 10);
        boolean boolean55 = realMatrixImpl42.isSingular();
        double double56 = realMatrixImpl42.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl37.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[] doubleArray64 = new double[] { 2, 10.0f, 300.0d, 0.0d, 11.0d, 1L };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        boolean boolean66 = realMatrixImpl42.equals((java.lang.Object) realMatrixImpl65);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[2.0, 10.0, 300.0, 0.0, 11.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double double37 = realMatrixImpl36.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray52 = realMatrixImpl43.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        boolean boolean54 = realMatrixImpl53.isSingular();
        double double55 = realMatrixImpl53.getNorm();
        int int56 = realMatrixImpl53.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.scalarMultiply((double) 5);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl53.getRowMatrix(1);
        double[][] doubleArray62 = realMatrixImpl53.getDataRef();
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        double[] doubleArray78 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl75.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl70.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        boolean boolean82 = realMatrixImpl70.isSquare();
        double double83 = realMatrixImpl70.getNorm();
        boolean boolean84 = realMatrixImpl70.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl70.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        boolean boolean87 = realMatrixImpl53.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double90 = realMatrixImpl53.getEntry((-1), 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 11.0d + "'", double55 == 11.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        int int21 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        boolean boolean31 = realMatrixImpl25.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl25.scalarAdd((double) (short) -1);
        double double34 = realMatrixImpl25.getNorm();
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double double39 = realMatrixImpl38.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.transpose();
        double[][] doubleArray41 = realMatrixImpl38.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[] doubleArray45 = realMatrixImpl42.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = realMatrixImpl7.operate(doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0]");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray28 = realMatrixImpl19.preMultiply(doubleArray27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        java.lang.String str30 = realMatrixImpl29.toString();
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.scalarMultiply((double) (short) 100);
        double[][] doubleArray37 = realMatrixImpl34.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl52.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl47.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        boolean boolean59 = realMatrixImpl47.isSquare();
        double double60 = realMatrixImpl47.getNorm();
        double[] doubleArray66 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        boolean boolean69 = realMatrixImpl47.equals((java.lang.Object) realMatrixImpl68);
        int int70 = realMatrixImpl47.getRowDimension();
        int int71 = realMatrixImpl47.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray75 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        double double77 = realMatrixImpl76.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl76.transpose();
        double[][] doubleArray79 = realMatrixImpl76.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray84 = realMatrixImpl82.getColumn(0);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl82);
        double[][] doubleArray86 = realMatrixImpl47.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl47.getSubMatrix(10, 97, 1, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str30, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(doubleArray86);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray53 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray54 = realMatrixImpl45.preMultiply(doubleArray53);
        double[] doubleArray55 = realMatrixImpl13.preMultiply(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl59.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        double[] doubleArray71 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl68.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl63.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        boolean boolean75 = realMatrixImpl63.isSquare();
        double double76 = realMatrixImpl63.getNorm();
        double[] doubleArray78 = realMatrixImpl63.getRow((int) (short) 1);
        double[] doubleArray79 = realMatrixImpl13.operate(doubleArray78);
        double[][] doubleArray80 = realMatrixImpl13.getDataRef();
        double[] doubleArray83 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray83);
        double[] doubleArray87 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl84.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl88);
        double[] doubleArray92 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray93 = realMatrixImpl84.preMultiply(doubleArray92);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92);
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl94.scalarMultiply(100.0d);
        java.lang.String str97 = realMatrixImpl94.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix98 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str97, "RealMatrixImpl{{10.0},{-1.0}}");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.scalarAdd(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.getColumnMatrix((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double double41 = realMatrixImpl7.getNorm();
        boolean boolean42 = realMatrixImpl7.isSquare();
        double[] doubleArray44 = realMatrixImpl7.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl7.copy();
        int int46 = realMatrixImpl7.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            double double47 = realMatrixImpl7.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 1L);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        boolean boolean21 = realMatrixImpl15.isSquare();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        boolean boolean41 = realMatrixImpl29.isSquare();
        double double42 = realMatrixImpl29.getNorm();
        boolean boolean43 = realMatrixImpl15.equals((java.lang.Object) double42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double double48 = realMatrixImpl47.getNorm();
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double double53 = realMatrixImpl52.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl52.transpose();
        double[] doubleArray56 = realMatrixImpl52.getColumn(0);
        double[] doubleArray57 = realMatrixImpl47.preMultiply(doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray59 = realMatrixImpl15.preMultiply(doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        double double62 = realMatrixImpl60.getNorm();
        int int63 = realMatrixImpl60.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.getColumnMatrix(0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(realMatrix65);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double double7 = realMatrixImpl3.getNorm();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray20 = realMatrixImpl11.preMultiply(doubleArray19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl21.scalarMultiply(100.0d);
        boolean boolean24 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl21);
        java.lang.String str25 = realMatrixImpl21.toString();
        double[][] doubleArray26 = realMatrixImpl21.getDataRef();
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl49.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[] doubleArray57 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray58 = realMatrixImpl49.preMultiply(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        double[] doubleArray66 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl63.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl67);
        boolean boolean69 = realMatrixImpl63.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl63.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl49.subtract(realMatrix71);
        int int73 = realMatrixImpl49.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl49.scalarAdd((double) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl49.scalarMultiply((double) 3);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str25, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double double11 = realMatrixImpl10.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.transpose();
        double[][] doubleArray13 = realMatrixImpl10.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        int int15 = realMatrixImpl14.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl14.scalarAdd((double) 1L);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl3.add(realMatrix17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl3.scalarAdd((double) (short) 1);
        double double21 = realMatrixImpl3.getNorm();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray34 = realMatrixImpl25.preMultiply(doubleArray33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl35.scalarMultiply(100.0d);
        java.lang.String str38 = realMatrixImpl35.toString();
        boolean boolean40 = realMatrixImpl35.equals((java.lang.Object) (-1.0d));
        double[][] doubleArray41 = realMatrixImpl35.getData();
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl54.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl49.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl58.transpose();
        boolean boolean62 = realMatrixImpl58.isSingular();
        double[] doubleArray64 = realMatrixImpl58.getColumn(0);
        double[] doubleArray65 = realMatrixImpl35.preMultiply(doubleArray64);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray66 = realMatrixImpl3.operate(doubleArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str38, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[][] doubleArray11 = realMatrixImpl10.getData();
        boolean boolean12 = realMatrixImpl10.isSquare();
        java.lang.String str13 = realMatrixImpl10.toString();
        boolean boolean14 = realMatrixImpl10.isSingular();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray45 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray46 = realMatrixImpl37.preMultiply(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        boolean boolean57 = realMatrixImpl51.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl51.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl37.subtract(realMatrix59);
        int int61 = realMatrixImpl37.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl37.scalarAdd((double) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl10.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str13, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(realMatrix64);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray55 = realMatrixImpl29.preMultiply(doubleArray52);
        double[] doubleArray56 = realMatrixImpl7.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        boolean boolean58 = realMatrixImpl57.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray60 = realMatrixImpl57.getColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double double11 = realMatrixImpl3.getNorm();
        java.lang.String str12 = realMatrixImpl3.toString();
        int int13 = realMatrixImpl3.getRowDimension();
        int int14 = realMatrixImpl3.getColumnDimension();
        int int15 = realMatrixImpl3.getColumnDimension();
        boolean boolean16 = realMatrixImpl3.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str12, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl3.preMultiply(doubleArray22);
        java.lang.String str26 = realMatrixImpl3.toString();
        double double29 = realMatrixImpl3.getEntry(0, 0);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl3.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl3.scalarAdd((double) 100);
        double[][] doubleArray33 = realMatrixImpl3.getData();
        double[][] doubleArray34 = realMatrixImpl3.getDataRef();
        double[][] doubleArray35 = realMatrixImpl3.getData();
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double double40 = realMatrixImpl39.getNorm();
        boolean boolean41 = realMatrixImpl39.isSingular();
        int int42 = realMatrixImpl39.getColumnDimension();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double double47 = realMatrixImpl46.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.transpose();
        double[][] doubleArray49 = realMatrixImpl46.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        int int51 = realMatrixImpl50.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl50.scalarAdd((double) 1L);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl39.add(realMatrix53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str26, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(realMatrix55);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) (short) -1);
        boolean boolean12 = realMatrixImpl3.isSquare();
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray24 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray25 = realMatrixImpl16.preMultiply(doubleArray24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        boolean boolean27 = realMatrixImpl26.isSingular();
        double double28 = realMatrixImpl26.getNorm();
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray41 = realMatrixImpl32.preMultiply(doubleArray40);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        java.lang.String str43 = realMatrixImpl42.toString();
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl47.scalarMultiply((double) (short) 100);
        double[][] doubleArray50 = realMatrixImpl47.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl42.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl3.subtract(realMatrix52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[][] doubleArray63 = realMatrixImpl57.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl64.copy();
        int int66 = realMatrixImpl64.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl64.scalarAdd((double) 3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 11.0d + "'", double28 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str43, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix69);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.getRowMatrix((int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl32.copy();
        java.lang.String str39 = realMatrixImpl32.toString();
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray52 = realMatrixImpl43.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        boolean boolean54 = realMatrixImpl53.isSingular();
        double[][] doubleArray55 = realMatrixImpl53.getDataRef();
        java.lang.String str56 = realMatrixImpl53.toString();
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double double61 = realMatrixImpl60.getNorm();
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double double66 = realMatrixImpl65.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl65.transpose();
        double[] doubleArray69 = realMatrixImpl65.getColumn(0);
        double[] doubleArray70 = realMatrixImpl60.preMultiply(doubleArray69);
        double[] doubleArray71 = realMatrixImpl53.preMultiply(doubleArray69);
        double[] doubleArray72 = realMatrixImpl32.preMultiply(doubleArray69);
        int int73 = realMatrixImpl32.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl32.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl32.scalarAdd(0.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str39, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str56, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix76);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray53 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray54 = realMatrixImpl45.preMultiply(doubleArray53);
        double[] doubleArray55 = realMatrixImpl13.preMultiply(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl59.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        double[] doubleArray71 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl68.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl63.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        boolean boolean75 = realMatrixImpl63.isSquare();
        double double76 = realMatrixImpl63.getNorm();
        double[] doubleArray78 = realMatrixImpl63.getRow((int) (short) 1);
        double[] doubleArray79 = realMatrixImpl13.operate(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl80.scalarMultiply((double) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl80.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(realMatrix83);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl16.getData();
        double double34 = realMatrixImpl16.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double double35 = realMatrixImpl16.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl15.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray39 = realMatrixImpl30.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray41 = realMatrixImpl15.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl15.scalarMultiply((double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        boolean boolean45 = realMatrixImpl15.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl15.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(realMatrix46);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.scalarMultiply(0.0d);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double double39 = realMatrixImpl38.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.transpose();
        double[][] doubleArray41 = realMatrixImpl38.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        boolean boolean43 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl42);
        boolean boolean44 = realMatrixImpl42.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl42.scalarMultiply(300.0d);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl59.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl54.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double[] doubleArray72 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl69.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        double[] doubleArray77 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray78 = realMatrixImpl69.preMultiply(doubleArray77);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        double[] doubleArray80 = realMatrixImpl54.preMultiply(doubleArray77);
        double double81 = realMatrixImpl54.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl42.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0d + "'", double81 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix82);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        double[] doubleArray26 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        boolean boolean29 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl28);
        boolean boolean30 = realMatrixImpl28.isSingular();
        double[] doubleArray32 = realMatrixImpl28.getRow(0);
        double double33 = realMatrixImpl28.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double double34 = realMatrixImpl28.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 12.0d + "'", double33 == 12.0d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        boolean boolean42 = realMatrixImpl36.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl36.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl22.subtract(realMatrix44);
        double[][] doubleArray46 = realMatrixImpl22.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray46);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[] doubleArray7 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double double9 = realMatrixImpl8.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl8.transpose();
        double[] doubleArray12 = realMatrixImpl8.getColumn(0);
        double[] doubleArray13 = realMatrixImpl3.preMultiply(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl3.scalarAdd((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl3.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl3.transpose();
        int int18 = realMatrixImpl3.getRowDimension();
        int int19 = realMatrixImpl3.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.scalarAdd((double) 'a');
        java.lang.String str43 = realMatrixImpl7.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl7.transpose();
        double double45 = realMatrixImpl7.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str43, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarMultiply((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl7.copy();
        int int11 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray12 = realMatrixImpl7.getData();
        boolean boolean13 = realMatrixImpl7.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double double23 = realMatrixImpl13.getNorm();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double double43 = realMatrixImpl31.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        java.lang.String str48 = realMatrixImpl13.toString();
        int int49 = realMatrixImpl13.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str48, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.scalarAdd((double) ' ');
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl40.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        int int16 = realMatrixImpl13.getRowDimension();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray29 = realMatrixImpl20.preMultiply(doubleArray28);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        boolean boolean31 = realMatrixImpl30.isSquare();
        int int32 = realMatrixImpl30.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl30.transpose();
        double double34 = realMatrixImpl30.getTrace();
        boolean boolean35 = realMatrixImpl30.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        int int37 = realMatrixImpl30.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl30.scalarAdd((double) '4');
        realMatrixImpl30.luDecompose();
        int int41 = realMatrixImpl30.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl30.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl30.add(realMatrix43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(realMatrix42);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[][] doubleArray42 = realMatrixImpl18.getData();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl50.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        boolean boolean62 = realMatrixImpl50.isSquare();
        int int63 = realMatrixImpl50.getColumnDimension();
        double[] doubleArray65 = realMatrixImpl50.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl18.scalarAdd((double) (-1.0f));
        double[] doubleArray72 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        double[] doubleArray76 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl73.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl77);
        boolean boolean79 = realMatrixImpl73.isSquare();
        int int80 = realMatrixImpl73.getColumnDimension();
        double[][] doubleArray81 = realMatrixImpl73.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        double[] doubleArray86 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray86);
        double[] doubleArray88 = realMatrixImpl83.preMultiply(doubleArray86);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl89 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray88);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray88);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray91 = realMatrixImpl18.preMultiply(doubleArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[1.0]");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(3, (int) (short) 1);
        double[] doubleArray5 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl6.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        double[] doubleArray14 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray15 = realMatrixImpl6.preMultiply(doubleArray14);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        boolean boolean17 = realMatrixImpl16.isSingular();
        double[][] doubleArray18 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        boolean boolean20 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl19);
        int int21 = realMatrixImpl2.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl2.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double double23 = realMatrixImpl13.getNorm();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double double43 = realMatrixImpl31.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[][] doubleArray48 = realMatrixImpl13.getDataRef();
        java.lang.Class<?> wildcardClass49 = realMatrixImpl13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.scalarMultiply((double) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        int int14 = realMatrixImpl10.getColumnDimension();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray45 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray46 = realMatrixImpl37.preMultiply(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl31.scalarMultiply(0.0d);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double double54 = realMatrixImpl53.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl53.transpose();
        double[][] doubleArray56 = realMatrixImpl53.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        boolean boolean58 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl57);
        boolean boolean59 = realMatrixImpl57.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double double65 = realMatrixImpl64.getNorm();
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double double70 = realMatrixImpl69.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl69.transpose();
        double[] doubleArray73 = realMatrixImpl69.getColumn(0);
        double[] doubleArray74 = realMatrixImpl64.preMultiply(doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl64.scalarAdd((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl64.copy();
        double[][] doubleArray78 = realMatrixImpl64.getDataRef();
        double[][] doubleArray79 = realMatrixImpl64.getData();
        double[] doubleArray82 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray82);
        double[] doubleArray86 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl83.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl87);
        double[] doubleArray91 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray92 = realMatrixImpl83.preMultiply(doubleArray91);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl93 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray91);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray91);
        double[] doubleArray95 = realMatrixImpl64.preMultiply(doubleArray91);
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl64.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix97 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        int int98 = realMatrixImpl57.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix96);
        org.junit.Assert.assertNotNull(realMatrix97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 2 + "'", int98 == 2);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        int int22 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray34 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray35 = realMatrixImpl26.preMultiply(doubleArray34);
        boolean boolean36 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl26);
        boolean boolean37 = realMatrixImpl26.isSingular();
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl45.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        double[] doubleArray68 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray69 = realMatrixImpl60.preMultiply(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl54.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix71);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[][] doubleArray19 = realMatrixImpl13.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        int int21 = realMatrixImpl20.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[][] doubleArray32 = realMatrixImpl26.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl26.scalarAdd((double) 1L);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        boolean boolean44 = realMatrixImpl38.isSquare();
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        boolean boolean64 = realMatrixImpl52.isSquare();
        double double65 = realMatrixImpl52.getNorm();
        boolean boolean66 = realMatrixImpl38.equals((java.lang.Object) double65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        double double71 = realMatrixImpl70.getNorm();
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        double double76 = realMatrixImpl75.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl75.transpose();
        double[] doubleArray79 = realMatrixImpl75.getColumn(0);
        double[] doubleArray80 = realMatrixImpl70.preMultiply(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray82 = realMatrixImpl38.preMultiply(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl26.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl83);
        double double85 = realMatrixImpl83.getNorm();
        boolean boolean86 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl83);
        boolean boolean87 = realMatrixImpl3.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.getRowMatrix(0);
        double[][] doubleArray10 = realMatrixImpl3.getDataRef();
        boolean boolean11 = realMatrixImpl3.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        int int8 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.copy();
        double[] doubleArray11 = realMatrixImpl7.getRow(0);
        int int12 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl7.copy();
        java.lang.String str14 = realMatrixImpl7.toString();
        double double15 = realMatrixImpl7.getNorm();
        boolean boolean16 = realMatrixImpl7.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.getColumnMatrix(97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{1.0},{0.0},{-1.0},{0.0}}" + "'", str14, "RealMatrixImpl{{10.0},{1.0},{0.0},{-1.0},{0.0}}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        double[] doubleArray6 = new double[] { 2, 10.0f, 300.0d, 0.0d, 11.0d, 1L };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl15.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        boolean boolean27 = realMatrixImpl15.isSquare();
        double double28 = realMatrixImpl15.getNorm();
        double[] doubleArray34 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        boolean boolean37 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl36);
        boolean boolean38 = realMatrixImpl36.isSingular();
        double[] doubleArray40 = realMatrixImpl36.getRow(0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = realMatrixImpl7.operate(doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.0, 10.0, 300.0, 0.0, 11.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0]");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[][] doubleArray4 = realMatrixImpl3.getDataRef();
        int int5 = realMatrixImpl3.getRowDimension();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double double10 = realMatrixImpl9.getNorm();
        double[][] doubleArray11 = realMatrixImpl9.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[][] doubleArray14 = realMatrixImpl13.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl13.getColumnMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl3.add(realMatrix16);
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double double22 = realMatrixImpl21.getNorm();
        boolean boolean23 = realMatrixImpl21.isSingular();
        int int24 = realMatrixImpl21.getColumnDimension();
        int int25 = realMatrixImpl21.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl21.scalarAdd((double) 3);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl21);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray41 = realMatrixImpl32.preMultiply(doubleArray40);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl42.scalarMultiply(100.0d);
        int int45 = realMatrixImpl42.getRowDimension();
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl49.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[] doubleArray57 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray58 = realMatrixImpl49.preMultiply(doubleArray57);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        boolean boolean60 = realMatrixImpl59.isSquare();
        int int61 = realMatrixImpl59.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl59.transpose();
        double double63 = realMatrixImpl59.getTrace();
        boolean boolean64 = realMatrixImpl59.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl42.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        int int66 = realMatrixImpl59.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl59.scalarAdd((double) '4');
        realMatrixImpl59.luDecompose();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(realMatrix68);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl28.scalarMultiply((double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl28.scalarMultiply((double) ' ');
        int int45 = realMatrixImpl28.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl28.scalarMultiply((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double48 = realMatrixImpl28.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(realMatrix47);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl3.transpose();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        double[][] doubleArray16 = realMatrixImpl10.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl17.copy();
        double[] doubleArray20 = realMatrixImpl17.getRow((int) (short) 0);
        boolean boolean21 = realMatrixImpl3.equals((java.lang.Object) doubleArray20);
        double double22 = realMatrixImpl3.getNorm();
        double[][] doubleArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl3.setSubMatrix(doubleArray23, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(3, (int) (short) 1);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        boolean boolean40 = realMatrixImpl39.isSingular();
        double[][] doubleArray41 = realMatrixImpl39.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        boolean boolean43 = realMatrixImpl25.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl25.scalarAdd((double) 10L);
        boolean boolean46 = realMatrixImpl18.equals((java.lang.Object) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl18.transpose();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl18.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(realMatrix47);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[][] doubleArray3 = realMatrixImpl2.getData();
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl11);
        double[] doubleArray15 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray16 = realMatrixImpl7.preMultiply(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        boolean boolean18 = realMatrixImpl17.isSingular();
        double double19 = realMatrixImpl17.getNorm();
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl17.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        boolean boolean40 = realMatrixImpl2.equals((java.lang.Object) realMatrix39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl2.copy();
        int int42 = realMatrixImpl2.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.0d + "'", double19 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        boolean boolean42 = realMatrixImpl36.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl36.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl22.subtract(realMatrix44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl22.scalarAdd((double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl22.scalarMultiply(10.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl22.transpose();
        int int51 = realMatrixImpl22.getRowDimension();
        double double52 = realMatrixImpl22.getNorm();
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        double[] doubleArray64 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray65 = realMatrixImpl56.preMultiply(doubleArray64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        boolean boolean67 = realMatrixImpl66.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl66.transpose();
        double double69 = realMatrixImpl66.getNorm();
        int int70 = realMatrixImpl66.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.transpose();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl22.subtract(realMatrix71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 11.0d + "'", double69 == 11.0d);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(realMatrix71);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        int int16 = realMatrixImpl15.getColumnDimension();
        double[][] doubleArray17 = realMatrixImpl15.getData();
        double[][] doubleArray18 = realMatrixImpl15.getDataRef();
        double[][] doubleArray19 = realMatrixImpl15.getData();
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        double[] doubleArray50 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray51 = realMatrixImpl42.preMultiply(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl36.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        boolean boolean62 = realMatrixImpl56.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl56.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl42.subtract(realMatrix64);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl42.scalarAdd((double) 10.0f);
        double[] doubleArray69 = realMatrixImpl42.getRow(1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        double[] doubleArray73 = realMatrixImpl15.operate(doubleArray69);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0]");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.scalarAdd((double) 'a');
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray55 = realMatrixImpl46.preMultiply(doubleArray54);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        boolean boolean57 = realMatrixImpl56.isSquare();
        int int58 = realMatrixImpl56.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl56.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.scalarAdd((double) 0);
        int int62 = realMatrixImpl56.getColumnDimension();
        double[][] doubleArray63 = realMatrixImpl56.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl56.scalarAdd((double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl56.transpose();
        boolean boolean67 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl56);
        java.lang.Class<?> wildcardClass68 = realMatrixImpl7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, 5);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.getColumnMatrix(0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = realMatrixImpl2.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl3.preMultiply(doubleArray22);
        boolean boolean26 = realMatrixImpl3.isSquare();
        boolean boolean27 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl3.scalarMultiply((double) (byte) 1);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray42 = realMatrixImpl33.preMultiply(doubleArray41);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        boolean boolean44 = realMatrixImpl43.isSquare();
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean54 = realMatrixImpl48.isSquare();
        int int55 = realMatrixImpl48.getColumnDimension();
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl59.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        double[] doubleArray67 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray68 = realMatrixImpl59.preMultiply(doubleArray67);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        double[] doubleArray70 = realMatrixImpl48.preMultiply(doubleArray67);
        boolean boolean71 = realMatrixImpl43.equals((java.lang.Object) realMatrixImpl48);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl48.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray77 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        double[] doubleArray81 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl78.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl82);
        double[] doubleArray86 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray87 = realMatrixImpl78.preMultiply(doubleArray86);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl89 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        int int91 = realMatrixImpl90.getColumnDimension();
        double[][] doubleArray92 = realMatrixImpl90.getData();
        double[][] doubleArray93 = realMatrixImpl90.getDataRef();
        double[][] doubleArray94 = realMatrixImpl90.getData();
        boolean boolean95 = realMatrixImpl48.equals((java.lang.Object) realMatrixImpl90);
        boolean boolean96 = realMatrixImpl48.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl16.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double double35 = realMatrixImpl34.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.copy();
        int int37 = realMatrixImpl34.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            double double38 = realMatrixImpl34.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        int int15 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl13.transpose();
        double double17 = realMatrixImpl13.getTrace();
        boolean boolean18 = realMatrixImpl13.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl13.getRowMatrix(0);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray33 = realMatrixImpl24.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        boolean boolean35 = realMatrixImpl34.isSingular();
        double double36 = realMatrixImpl34.getNorm();
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl49.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl44.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl13.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl53.scalarAdd((double) '#');
        double[][] doubleArray60 = realMatrixImpl53.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 11.0d + "'", double36 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray60);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = realMatrixImpl8.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl7.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarMultiply(1.0d);
        boolean boolean13 = realMatrixImpl7.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        int int7 = realMatrixImpl6.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.copy();
        boolean boolean9 = realMatrixImpl6.isSingular();
        double[][] doubleArray10 = realMatrixImpl6.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        boolean boolean35 = realMatrixImpl23.isSquare();
        int int36 = realMatrixImpl23.getColumnDimension();
        double[] doubleArray38 = realMatrixImpl23.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray40 = realMatrixImpl13.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl42.getRowMatrix(0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl16.transpose();
        boolean boolean20 = realMatrixImpl16.isSingular();
        double[][] doubleArray21 = realMatrixImpl16.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl16.scalarAdd((double) 'a');
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray36 = realMatrixImpl27.preMultiply(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl37.scalarMultiply(100.0d);
        int int40 = realMatrixImpl37.getRowDimension();
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        boolean boolean55 = realMatrixImpl54.isSquare();
        int int56 = realMatrixImpl54.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl54.transpose();
        double double58 = realMatrixImpl54.getTrace();
        boolean boolean59 = realMatrixImpl54.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl37.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        int int61 = realMatrixImpl54.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl54.scalarAdd((double) '4');
        realMatrixImpl54.luDecompose();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl54.scalarMultiply(10.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl54.inverse();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix67);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl16.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double double35 = realMatrixImpl34.getNorm();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        boolean boolean48 = realMatrixImpl42.isSquare();
        int int49 = realMatrixImpl42.getColumnDimension();
        double double50 = realMatrixImpl42.getNorm();
        boolean boolean51 = realMatrixImpl38.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl34.copy();
        double double54 = realMatrixImpl34.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl24.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean36 = realMatrixImpl33.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl33.copy();
        int int38 = realMatrixImpl33.getRowDimension();
        int int39 = realMatrixImpl33.getRowDimension();
        int int40 = realMatrixImpl33.getColumnDimension();
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl48.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        boolean boolean60 = realMatrixImpl57.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl57.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl57.scalarMultiply((double) 10L);
        java.lang.String str64 = realMatrixImpl57.toString();
        boolean boolean65 = realMatrixImpl33.equals((java.lang.Object) realMatrixImpl57);
        double[][] doubleArray66 = realMatrixImpl57.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str64, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleArray66);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) (byte) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.getRowMatrix((int) (short) 0);
        double[] doubleArray7 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl8.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl12.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl21);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray36 = realMatrixImpl27.preMultiply(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double double42 = realMatrixImpl41.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl21.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[] doubleArray66 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        double[] doubleArray70 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl67.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl71);
        double[] doubleArray75 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray76 = realMatrixImpl67.preMultiply(doubleArray75);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        double[] doubleArray78 = realMatrixImpl52.preMultiply(doubleArray75);
        double[] doubleArray79 = realMatrixImpl41.preMultiply(doubleArray75);
        double[] doubleArray80 = realMatrixImpl2.preMultiply(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray85 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl86 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        double[] doubleArray89 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray89);
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl86.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl90);
        double[] doubleArray94 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray95 = realMatrixImpl86.preMultiply(doubleArray94);
        double[] doubleArray96 = realMatrixImpl82.preMultiply(doubleArray95);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[1.0]");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, 1);
        boolean boolean3 = realMatrixImpl2.isSquare();
        double[][] doubleArray4 = realMatrixImpl2.getData();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = realMatrixImpl2.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        double[][] doubleArray18 = realMatrixImpl16.getDataRef();
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double[] doubleArray49 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray50 = realMatrixImpl41.preMultiply(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl35.scalarMultiply(0.0d);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double double58 = realMatrixImpl57.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl57.transpose();
        double[][] doubleArray60 = realMatrixImpl57.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        boolean boolean62 = realMatrixImpl35.equals((java.lang.Object) realMatrixImpl61);
        boolean boolean63 = realMatrixImpl61.isSquare();
        int int64 = realMatrixImpl61.getRowDimension();
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        double[] doubleArray71 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl68.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        double[][] doubleArray74 = realMatrixImpl68.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        boolean boolean76 = realMatrixImpl75.isSquare();
        double double77 = realMatrixImpl75.getNorm();
        boolean boolean78 = realMatrixImpl61.equals((java.lang.Object) realMatrixImpl75);
        double[] doubleArray81 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        double[] doubleArray85 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl86 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl82.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl86);
        double[] doubleArray90 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray91 = realMatrixImpl82.preMultiply(doubleArray90);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray90);
        boolean boolean93 = realMatrixImpl92.isSingular();
        double[][] doubleArray94 = realMatrixImpl92.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl95 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray94);
        int int96 = realMatrixImpl95.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix97 = realMatrixImpl61.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl95);
        int int98 = realMatrixImpl95.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix99 = realMatrixImpl16.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl95);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 2 + "'", int96 == 2);
        org.junit.Assert.assertNotNull(realMatrix97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 2 + "'", int98 == 2);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl52.transpose();
        boolean boolean56 = realMatrixImpl52.isSingular();
        boolean boolean57 = realMatrixImpl13.equals((java.lang.Object) boolean56);
        boolean boolean58 = realMatrixImpl13.isSingular();
        double[][] doubleArray59 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl13.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl13.getColumnMatrix((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(realMatrix63);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        int int16 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.scalarMultiply((double) 5);
        double[][] doubleArray19 = realMatrixImpl13.getDataRef();
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray31 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray32 = realMatrixImpl23.preMultiply(doubleArray31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl37.scalarMultiply((double) (short) 100);
        double[] doubleArray41 = realMatrixImpl37.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int int44 = realMatrixImpl33.getColumnDimension();
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl48.scalarMultiply((double) (short) 100);
        double[][] doubleArray51 = realMatrixImpl48.getDataRef();
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl64.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl59.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        boolean boolean71 = realMatrixImpl59.isSquare();
        double double72 = realMatrixImpl59.getNorm();
        double[] doubleArray78 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        boolean boolean81 = realMatrixImpl59.equals((java.lang.Object) realMatrixImpl80);
        int int82 = realMatrixImpl59.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl59.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl48.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl33.copy();
        java.lang.String str88 = realMatrixImpl33.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str88, "RealMatrixImpl{{10.0},{-1.0}}");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl3.preMultiply(doubleArray22);
        boolean boolean26 = realMatrixImpl3.isSquare();
        boolean boolean27 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl3.scalarMultiply((double) (byte) 1);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray42 = realMatrixImpl33.preMultiply(doubleArray41);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        boolean boolean44 = realMatrixImpl43.isSquare();
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean54 = realMatrixImpl48.isSquare();
        int int55 = realMatrixImpl48.getColumnDimension();
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl59.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        double[] doubleArray67 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray68 = realMatrixImpl59.preMultiply(doubleArray67);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        double[] doubleArray70 = realMatrixImpl48.preMultiply(doubleArray67);
        boolean boolean71 = realMatrixImpl43.equals((java.lang.Object) realMatrixImpl48);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl48.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl48.scalarMultiply((-1.0d));
        double[] doubleArray79 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray83 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray83);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl80.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl84);
        double[][] doubleArray86 = realMatrixImpl80.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl80.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl80);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertNotNull(realMatrix88);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[][] doubleArray42 = realMatrixImpl18.getData();
        double[][] doubleArray43 = realMatrixImpl18.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        java.lang.String str45 = realMatrixImpl44.toString();
        int int46 = realMatrixImpl44.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str45, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        boolean boolean10 = realMatrixImpl3.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl3.scalarMultiply((double) (short) -1);
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        boolean boolean20 = realMatrixImpl19.isSingular();
        java.lang.String str21 = realMatrixImpl19.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl19.transpose();
        java.lang.String str23 = realMatrixImpl19.toString();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double double28 = realMatrixImpl27.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.transpose();
        double[][] doubleArray30 = realMatrixImpl27.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.scalarAdd(0.0d);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl19.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect row dimension");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str21, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str23, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix3 = realMatrixImpl2.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        int int11 = realMatrixImpl10.getRowDimension();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[][] doubleArray21 = realMatrixImpl15.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[][] doubleArray23 = realMatrixImpl22.getData();
        boolean boolean24 = realMatrixImpl22.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl22.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl10.scalarMultiply((double) 5);
        double[][] doubleArray29 = realMatrixImpl10.getDataRef();
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double double34 = realMatrixImpl33.getNorm();
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double double39 = realMatrixImpl38.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.transpose();
        double[] doubleArray42 = realMatrixImpl38.getColumn(0);
        double[] doubleArray43 = realMatrixImpl33.preMultiply(doubleArray42);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = realMatrixImpl10.solve(doubleArray42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0]");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.scalarMultiply((double) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.scalarMultiply((double) '#');
        boolean boolean16 = realMatrixImpl10.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl10.scalarMultiply((double) (short) 1);
        java.lang.String str19 = realMatrixImpl10.toString();
        double[] doubleArray21 = realMatrixImpl10.getColumn(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarMultiply((double) (short) 100);
        double[][] doubleArray29 = realMatrixImpl26.getDataRef();
        double[][] doubleArray30 = realMatrixImpl26.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[][] doubleArray32 = realMatrixImpl31.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str19, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(realMatrix35);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double double23 = realMatrixImpl13.getNorm();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double double43 = realMatrixImpl31.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[][] doubleArray48 = realMatrixImpl13.getDataRef();
        double[][] doubleArray49 = realMatrixImpl13.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        boolean boolean51 = realMatrixImpl50.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double52 = realMatrixImpl50.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        int int8 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray9 = realMatrixImpl7.getData();
        double[][] doubleArray10 = realMatrixImpl7.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        java.lang.String str16 = realMatrixImpl13.toString();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl24.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray48 = realMatrixImpl39.preMultiply(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[][] doubleArray50 = realMatrixImpl39.getData();
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl54.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        double[] doubleArray66 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl63.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl58.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl67);
        double[] doubleArray72 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        double[] doubleArray76 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl73.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl77);
        double[] doubleArray81 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray82 = realMatrixImpl73.preMultiply(doubleArray81);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        double[] doubleArray84 = realMatrixImpl58.preMultiply(doubleArray81);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray84);
        boolean boolean86 = realMatrixImpl85.isSquare();
        boolean boolean87 = realMatrixImpl39.equals((java.lang.Object) realMatrixImpl85);
        boolean boolean88 = realMatrixImpl85.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl85);
        java.lang.Class<?> wildcardClass90 = realMatrixImpl13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str16, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray55 = realMatrixImpl29.preMultiply(doubleArray52);
        double[] doubleArray56 = realMatrixImpl7.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.scalarAdd((double) '4');
        boolean boolean62 = realMatrixImpl59.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[][] doubleArray42 = realMatrixImpl18.getData();
        double[][] doubleArray43 = realMatrixImpl18.getData();
        double double44 = realMatrixImpl18.getNorm();
        int[] intArray46 = new int[] { (byte) 10 };
        int[] intArray52 = new int[] { (byte) 0, 0, 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl18.getSubMatrix(intArray46, intArray52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0, 100, 1, 1]");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl22.transpose();
        boolean boolean26 = realMatrixImpl22.isSingular();
        boolean boolean27 = realMatrixImpl22.isSquare();
        double[][] doubleArray28 = realMatrixImpl22.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl22.scalarAdd((double) 1.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray43 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray44 = realMatrixImpl35.preMultiply(doubleArray43);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        boolean boolean46 = realMatrixImpl45.isSquare();
        int int47 = realMatrixImpl45.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl45.transpose();
        double double49 = realMatrixImpl45.getTrace();
        boolean boolean50 = realMatrixImpl45.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl22.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(realMatrix51);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double double19 = realMatrixImpl7.getNorm();
        int int20 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl7.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.scalarAdd((double) (-1));
        int int24 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl7.transpose();
        double[][] doubleArray26 = realMatrixImpl7.getDataRef();
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray39 = realMatrixImpl30.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        boolean boolean41 = realMatrixImpl40.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl40.transpose();
        int int43 = realMatrixImpl40.getColumnDimension();
        double[][] doubleArray44 = realMatrixImpl40.getDataRef();
        double[][] doubleArray45 = realMatrixImpl40.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        java.lang.Class<?> wildcardClass47 = realMatrix46.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl9.scalarAdd(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl9.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl16.getData();
        double double34 = realMatrixImpl16.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl16.getRowMatrix((int) (byte) 1);
        int int37 = realMatrixImpl16.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double double23 = realMatrixImpl13.getNorm();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double double43 = realMatrixImpl31.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[][] doubleArray48 = realMatrixImpl13.getDataRef();
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl52.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        double[] doubleArray60 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray61 = realMatrixImpl52.preMultiply(doubleArray60);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        boolean boolean63 = realMatrixImpl62.isSingular();
        double[][] doubleArray64 = realMatrixImpl62.getDataRef();
        java.lang.String str65 = realMatrixImpl62.toString();
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double double70 = realMatrixImpl69.getNorm();
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double double75 = realMatrixImpl74.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl74.transpose();
        double[] doubleArray78 = realMatrixImpl74.getColumn(0);
        double[] doubleArray79 = realMatrixImpl69.preMultiply(doubleArray78);
        double[] doubleArray80 = realMatrixImpl62.preMultiply(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        double[] doubleArray84 = realMatrixImpl13.preMultiply(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray84);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str65, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0]");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl3.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.copy();
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[][] doubleArray13 = realMatrixImpl12.getDataRef();
        int int14 = realMatrixImpl12.getRowDimension();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double double19 = realMatrixImpl18.getNorm();
        double[][] doubleArray20 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[][] doubleArray23 = realMatrixImpl22.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl22.getColumnMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl12.add(realMatrix25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl12);
        int int28 = realMatrixImpl3.getRowDimension();
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray41 = realMatrixImpl32.preMultiply(doubleArray40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl54.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl49.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        boolean boolean61 = realMatrixImpl49.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl32.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        boolean boolean63 = realMatrixImpl49.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl49.scalarAdd(1.0d);
        double[][] doubleArray66 = realMatrixImpl49.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl49.scalarAdd((double) 0);
        double double69 = realMatrixImpl49.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl3.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.copy();
        double[][] doubleArray21 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = realMatrixImpl23.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double double32 = realMatrixImpl31.getNorm();
        boolean boolean33 = realMatrixImpl31.isSingular();
        int int34 = realMatrixImpl31.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.scalarAdd(1.0d);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double double41 = realMatrixImpl40.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl40.transpose();
        double[][] doubleArray43 = realMatrixImpl40.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        boolean boolean45 = realMatrixImpl44.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        boolean boolean47 = realMatrixImpl44.isSquare();
        boolean boolean48 = realMatrixImpl27.equals((java.lang.Object) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl27.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl27.inverse();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix50);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray42 = realMatrixImpl33.preMultiply(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[][] doubleArray44 = realMatrixImpl33.getData();
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[] doubleArray66 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        double[] doubleArray70 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl67.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl71);
        double[] doubleArray75 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray76 = realMatrixImpl67.preMultiply(doubleArray75);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        double[] doubleArray78 = realMatrixImpl52.preMultiply(doubleArray75);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        boolean boolean80 = realMatrixImpl79.isSquare();
        boolean boolean81 = realMatrixImpl33.equals((java.lang.Object) realMatrixImpl79);
        boolean boolean82 = realMatrixImpl79.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl10.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        int int84 = realMatrixImpl79.getColumnDimension();
        java.lang.String str85 = realMatrixImpl79.toString();
        double double86 = realMatrixImpl79.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str85, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[][] doubleArray3 = realMatrixImpl2.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', 5);
        int[] intArray10 = new int[] { (short) 0, (short) 1, (byte) 1 };
        int[] intArray12 = new int[] { 2 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl6.getSubMatrix(intArray10, intArray12);
        int[] intArray20 = new int[] { 97, (-1), (short) -1, (byte) 1, 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl2.getSubMatrix(intArray10, intArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2]");
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, -1, 1, 97, 1]");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl3.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarMultiply((double) 100.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl26.scalarAdd((double) 0.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix30);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        boolean boolean8 = realMatrixImpl7.isSingular();
        boolean boolean9 = realMatrixImpl7.isSingular();
        double[] doubleArray11 = realMatrixImpl7.getColumn((int) (byte) 0);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        boolean boolean21 = realMatrixImpl15.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl15.scalarAdd((double) (short) -1);
        boolean boolean24 = realMatrixImpl15.isSquare();
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[] doubleArray36 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray37 = realMatrixImpl28.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        boolean boolean39 = realMatrixImpl38.isSingular();
        double double40 = realMatrixImpl38.getNorm();
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        java.lang.String str55 = realMatrixImpl54.toString();
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.scalarMultiply((double) (short) 100);
        double[][] doubleArray62 = realMatrixImpl59.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl54.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl38.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl15.subtract(realMatrix64);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl7.subtract(realMatrix65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 11.0d + "'", double40 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str55, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        boolean boolean28 = realMatrixImpl16.isSquare();
        int int29 = realMatrixImpl16.getColumnDimension();
        double[] doubleArray31 = realMatrixImpl16.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray45 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray46 = realMatrixImpl37.preMultiply(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray48 = realMatrixImpl33.preMultiply(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double double54 = realMatrixImpl53.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl53.transpose();
        double[] doubleArray57 = realMatrixImpl53.getColumn(0);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl53.scalarMultiply((double) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl49.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        java.lang.String str72 = realMatrixImpl66.toString();
        double[] doubleArray75 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        double[] doubleArray79 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl76.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl80);
        double[][] doubleArray82 = realMatrixImpl76.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray82);
        int int84 = realMatrixImpl83.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl66.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl83);
        boolean boolean86 = realMatrixImpl53.equals((java.lang.Object) realMatrix85);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str72, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2 + "'", int84 == 2);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl22.getData();
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl41.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        double[] doubleArray64 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray65 = realMatrixImpl56.preMultiply(doubleArray64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double[] doubleArray67 = realMatrixImpl41.preMultiply(doubleArray64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        boolean boolean69 = realMatrixImpl68.isSquare();
        boolean boolean70 = realMatrixImpl22.equals((java.lang.Object) realMatrixImpl68);
        boolean boolean71 = realMatrixImpl68.isSquare();
        int[] intArray73 = new int[] { 3 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', 5);
        int[] intArray80 = new int[] { (short) 0, (short) 1, (byte) 1 };
        int[] intArray82 = new int[] { 2 };
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl76.getSubMatrix(intArray80, intArray82);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl68.getSubMatrix(intArray73, intArray82);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[3]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[2]");
        org.junit.Assert.assertNotNull(realMatrix83);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.scalarMultiply((double) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarMultiply(100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl3.transpose();
        double double13 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl3.scalarAdd((double) 5);
        java.lang.String str16 = realMatrixImpl3.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str16, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.scalarAdd((double) 'a');
        java.lang.String str43 = realMatrixImpl7.toString();
        double[][] doubleArray44 = realMatrixImpl7.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str43, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '4', 3);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) (short) 1);
        double[][] doubleArray5 = realMatrixImpl2.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl2.getColumnMatrix(2);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl2.scalarAdd((double) 10.0f);
        boolean boolean10 = realMatrixImpl2.isSingular();
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        int int16 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.scalarMultiply((double) 5);
        double[][] doubleArray19 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        java.lang.String str22 = realMatrixImpl21.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl21.getColumnMatrix((int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str22, "RealMatrixImpl{{10.0},{-1.0}}");
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        boolean boolean10 = realMatrixImpl9.isSingular();
        java.lang.String str11 = realMatrixImpl9.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl9.scalarAdd((double) 10L);
        double[] doubleArray15 = realMatrixImpl9.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl9.scalarAdd((double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str11, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarMultiply((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.scalarMultiply((double) (byte) 1);
        java.lang.String str14 = realMatrixImpl3.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str14, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.copy();
        int int21 = realMatrixImpl16.getRowDimension();
        int int22 = realMatrixImpl16.getRowDimension();
        int int23 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray24 = realMatrixImpl16.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl16.scalarMultiply((double) (short) 100);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double double31 = realMatrixImpl30.getNorm();
        boolean boolean32 = realMatrixImpl30.isSingular();
        int int33 = realMatrixImpl30.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.scalarAdd(1.0d);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double double40 = realMatrixImpl39.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl39.transpose();
        double[][] doubleArray42 = realMatrixImpl39.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        boolean boolean44 = realMatrixImpl43.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl30.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        boolean boolean46 = realMatrixImpl43.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        boolean boolean57 = realMatrixImpl51.isSquare();
        int int58 = realMatrixImpl51.getColumnDimension();
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl62.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        double[] doubleArray70 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray71 = realMatrixImpl62.preMultiply(doubleArray70);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        double[] doubleArray73 = realMatrixImpl51.preMultiply(doubleArray70);
        boolean boolean74 = realMatrixImpl51.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl43.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double double41 = realMatrixImpl7.getNorm();
        boolean boolean42 = realMatrixImpl7.isSquare();
        double[] doubleArray44 = realMatrixImpl7.getRow((int) (byte) 1);
        int int45 = realMatrixImpl7.getRowDimension();
        boolean boolean46 = realMatrixImpl7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl7.scalarMultiply((double) 10L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(realMatrix48);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = realMatrixImpl3.getEntry((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        int int16 = realMatrixImpl13.getRowDimension();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray29 = realMatrixImpl20.preMultiply(doubleArray28);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        boolean boolean31 = realMatrixImpl30.isSquare();
        int int32 = realMatrixImpl30.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl30.transpose();
        double double34 = realMatrixImpl30.getTrace();
        boolean boolean35 = realMatrixImpl30.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        int int37 = realMatrixImpl30.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl30.scalarAdd((double) '4');
        realMatrixImpl30.luDecompose();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl30.scalarMultiply(10.0d);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[][] doubleArray52 = realMatrixImpl46.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl46.scalarAdd((double) 1L);
        int int55 = realMatrixImpl46.getRowDimension();
        boolean boolean56 = realMatrixImpl30.equals((java.lang.Object) int55);
        boolean boolean57 = realMatrixImpl30.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, 1);
        boolean boolean3 = realMatrixImpl2.isSquare();
        int int4 = realMatrixImpl2.getColumnDimension();
        double double5 = realMatrixImpl2.getNorm();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray22 = realMatrixImpl7.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl23.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        int int17 = realMatrixImpl16.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl16.scalarAdd((double) 10);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        boolean boolean39 = realMatrixImpl27.isSquare();
        double double40 = realMatrixImpl27.getNorm();
        double[] doubleArray46 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        boolean boolean49 = realMatrixImpl27.equals((java.lang.Object) realMatrixImpl48);
        int int50 = realMatrixImpl27.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl27.scalarAdd((-1.0d));
        double[] doubleArray54 = realMatrixImpl27.getRow((int) (short) 0);
        boolean boolean55 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl27);
        double double56 = realMatrixImpl27.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        boolean boolean35 = realMatrixImpl23.isSquare();
        int int36 = realMatrixImpl23.getColumnDimension();
        double[] doubleArray38 = realMatrixImpl23.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray40 = realMatrixImpl13.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, 10);
        boolean boolean44 = realMatrixImpl13.equals((java.lang.Object) (short) 1);
        double double45 = realMatrixImpl13.getNorm();
        double[] doubleArray47 = realMatrixImpl13.getColumn(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 11.0d + "'", double45 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0]");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarMultiply((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl7.copy();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl14.scalarMultiply((double) (short) 100);
        java.lang.String str17 = realMatrixImpl14.toString();
        int int18 = realMatrixImpl14.getColumnDimension();
        double double19 = realMatrixImpl14.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray33 = realMatrixImpl24.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        boolean boolean35 = realMatrixImpl34.isSingular();
        double[][] doubleArray36 = realMatrixImpl34.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double double38 = realMatrixImpl37.getNorm();
        double[][] doubleArray39 = realMatrixImpl37.getDataRef();
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        boolean boolean49 = realMatrixImpl43.isSquare();
        int int50 = realMatrixImpl43.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        boolean boolean52 = realMatrixImpl43.isSingular();
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl65.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl60.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        double[] doubleArray78 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl75.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        double[] doubleArray83 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray84 = realMatrixImpl75.preMultiply(doubleArray83);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl69.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        double[] doubleArray88 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl89 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray88);
        double double90 = realMatrixImpl89.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl89.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix92 = realMatrixImpl69.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl89);
        org.apache.commons.math.linear.RealMatrix realMatrix94 = realMatrixImpl89.scalarAdd((double) 1.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix95 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl89);
        org.apache.commons.math.linear.RealMatrix realMatrix97 = realMatrixImpl43.scalarAdd((double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix98 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        java.lang.Class<?> wildcardClass99 = realMatrixImpl43.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str17, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 11.0d + "'", double38 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 1.0d + "'", double90 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertNotNull(realMatrix92);
        org.junit.Assert.assertNotNull(realMatrix94);
        org.junit.Assert.assertNotNull(realMatrix95);
        org.junit.Assert.assertNotNull(realMatrix97);
        org.junit.Assert.assertNotNull(realMatrix98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        java.lang.String str16 = realMatrixImpl13.toString();
        boolean boolean18 = realMatrixImpl13.equals((java.lang.Object) (-1.0d));
        double[][] doubleArray19 = realMatrixImpl13.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        int int21 = realMatrixImpl20.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str16, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) (short) -1);
        boolean boolean12 = realMatrixImpl3.isSquare();
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray24 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray25 = realMatrixImpl16.preMultiply(doubleArray24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        boolean boolean27 = realMatrixImpl26.isSingular();
        double double28 = realMatrixImpl26.getNorm();
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray41 = realMatrixImpl32.preMultiply(doubleArray40);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        java.lang.String str43 = realMatrixImpl42.toString();
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl47.scalarMultiply((double) (short) 100);
        double[][] doubleArray50 = realMatrixImpl47.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl42.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl3.subtract(realMatrix52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[][] doubleArray63 = realMatrixImpl57.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl64.copy();
        int int66 = realMatrixImpl64.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl64.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 11.0d + "'", double28 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str43, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl24.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray48 = realMatrixImpl39.preMultiply(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double double54 = realMatrixImpl53.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl53.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        double[] doubleArray68 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray69 = realMatrixImpl60.preMultiply(doubleArray68);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        boolean boolean71 = realMatrixImpl70.isSingular();
        double double72 = realMatrixImpl70.getNorm();
        int int73 = realMatrixImpl70.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl70.scalarMultiply((double) 5);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl53.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl70.getRowMatrix(1);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl70.scalarAdd((double) (byte) -1);
        double[][] doubleArray82 = realMatrixImpl70.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl70.transpose();
        double[][] doubleArray84 = realMatrixImpl70.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 11.0d + "'", double72 == 11.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(doubleArray84);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        boolean boolean8 = realMatrixImpl3.isSquare();
        java.lang.String str9 = realMatrixImpl3.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl3.getSubMatrix((-1), (int) (byte) 100, (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarMultiply((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double5 = realMatrixImpl2.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.getRowMatrix(0);
        boolean boolean9 = realMatrixImpl6.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl6.scalarMultiply(300.0d);
        boolean boolean12 = realMatrixImpl6.isSingular();
        boolean boolean13 = realMatrixImpl6.isSquare();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl16.transpose();
        double[][] doubleArray20 = realMatrixImpl16.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        double[][] doubleArray18 = realMatrixImpl16.getDataRef();
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        int int29 = realMatrixImpl22.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl22.scalarMultiply((double) (-1.0f));
        boolean boolean33 = realMatrixImpl22.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl22.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.scalarMultiply((double) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.scalarMultiply((double) '#');
        boolean boolean16 = realMatrixImpl10.isSingular();
        double[][] doubleArray17 = realMatrixImpl10.getData();
        int int18 = realMatrixImpl10.getColumnDimension();
        double[][] doubleArray19 = realMatrixImpl10.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        int int15 = realMatrixImpl13.getColumnDimension();
        double double16 = realMatrixImpl13.getDeterminant();
        int int17 = realMatrixImpl13.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl13.scalarMultiply((double) (byte) 100);
        double double20 = realMatrixImpl13.getDeterminant();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[][] doubleArray30 = realMatrixImpl24.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl24.scalarMultiply((double) (byte) 100);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray44 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray45 = realMatrixImpl36.preMultiply(doubleArray44);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        boolean boolean47 = realMatrixImpl46.isSingular();
        double double48 = realMatrixImpl46.getNorm();
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl52.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl61.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl56.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl46.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl24.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        double[][] doubleArray70 = realMatrixImpl24.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl13.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        double[] doubleArray78 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl75.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        double[] doubleArray83 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray84 = realMatrixImpl75.preMultiply(doubleArray83);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray84);
        boolean boolean86 = realMatrixImpl85.isSquare();
        int int87 = realMatrixImpl85.getColumnDimension();
        double[][] doubleArray88 = realMatrixImpl85.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl24.setSubMatrix(doubleArray88, (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 11.0d + "'", double48 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(doubleArray88);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, 5);
        double[] doubleArray5 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.scalarMultiply((double) (short) 100);
        java.lang.String str9 = realMatrixImpl6.toString();
        double double10 = realMatrixImpl6.getNorm();
        boolean boolean11 = realMatrixImpl6.isSingular();
        double[] doubleArray13 = realMatrixImpl6.getColumn(0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl6.scalarMultiply((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl15.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray39 = realMatrixImpl30.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray41 = realMatrixImpl15.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl15.scalarMultiply((double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        boolean boolean45 = realMatrixImpl3.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl3.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(realMatrix46);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '4', (int) 'a');
        double[][] doubleArray3 = realMatrixImpl2.getDataRef();
        boolean boolean4 = realMatrixImpl2.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl2.copy();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.copy();
        double[][] doubleArray21 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = realMatrixImpl23.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl26.inverse();
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        boolean boolean47 = realMatrixImpl35.isSquare();
        int int48 = realMatrixImpl35.getColumnDimension();
        double[] doubleArray50 = realMatrixImpl35.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        int int53 = realMatrixImpl52.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl52.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl26.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(realMatrix54);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(5, 10);
        double double3 = realMatrixImpl2.getNorm();
        boolean boolean4 = realMatrixImpl2.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl2.transpose();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(10, 2);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl3.transpose();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        double[][] doubleArray16 = realMatrixImpl10.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl17.copy();
        double[] doubleArray20 = realMatrixImpl17.getRow((int) (short) 0);
        boolean boolean21 = realMatrixImpl3.equals((java.lang.Object) doubleArray20);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl22.copy();
        double[][] doubleArray24 = realMatrixImpl22.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        int int16 = realMatrixImpl13.getRowDimension();
        int int17 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl13.transpose();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) (byte) 10);
        int int23 = realMatrixImpl22.getColumnDimension();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double double28 = realMatrixImpl27.getNorm();
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double double33 = realMatrixImpl32.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl32.transpose();
        double[] doubleArray36 = realMatrixImpl32.getColumn(0);
        double[] doubleArray37 = realMatrixImpl27.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl38.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.copy();
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        boolean boolean50 = realMatrixImpl44.isSquare();
        int int51 = realMatrixImpl44.getColumnDimension();
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        double[] doubleArray63 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray64 = realMatrixImpl55.preMultiply(doubleArray63);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray66 = realMatrixImpl44.preMultiply(doubleArray63);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray68 = realMatrixImpl38.preMultiply(doubleArray63);
        double[] doubleArray69 = realMatrixImpl22.preMultiply(doubleArray68);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray70 = realMatrixImpl13.solve(doubleArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[][] doubleArray19 = realMatrixImpl13.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        int int21 = realMatrixImpl20.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double double23 = realMatrixImpl3.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int42 = realMatrixImpl13.getColumnDimension();
        double[] doubleArray48 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        int int51 = realMatrixImpl50.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl50.copy();
        double[] doubleArray54 = realMatrixImpl50.getRow(0);
        int int55 = realMatrixImpl50.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl50.copy();
        java.lang.String str57 = realMatrixImpl50.toString();
        boolean boolean58 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl50);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray60 = realMatrixImpl13.getColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "RealMatrixImpl{{10.0},{1.0},{0.0},{-1.0},{0.0}}" + "'", str57, "RealMatrixImpl{{10.0},{1.0},{0.0},{-1.0},{0.0}}");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl22.getData();
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl41.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        double[] doubleArray64 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray65 = realMatrixImpl56.preMultiply(doubleArray64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double[] doubleArray67 = realMatrixImpl41.preMultiply(doubleArray64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        boolean boolean69 = realMatrixImpl68.isSquare();
        boolean boolean70 = realMatrixImpl22.equals((java.lang.Object) realMatrixImpl68);
        double double71 = realMatrixImpl68.getTrace();
        double[][] doubleArray72 = realMatrixImpl68.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        boolean boolean10 = realMatrixImpl3.isSquare();
        java.lang.String str11 = realMatrixImpl3.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.scalarMultiply((double) (short) 0);
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str11, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 100, 97);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray33 = realMatrixImpl7.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        boolean boolean35 = realMatrixImpl34.isSquare();
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl39.scalarMultiply((double) (short) -1);
        boolean boolean47 = realMatrixImpl34.equals((java.lang.Object) realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl39.copy();
        boolean boolean49 = realMatrixImpl39.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl39.scalarMultiply(300.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl39.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[] doubleArray7 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double double9 = realMatrixImpl8.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl8.transpose();
        double[] doubleArray12 = realMatrixImpl8.getColumn(0);
        double[] doubleArray13 = realMatrixImpl3.preMultiply(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[][] doubleArray15 = realMatrixImpl14.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double double21 = realMatrixImpl20.getNorm();
        boolean boolean22 = realMatrixImpl20.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl20.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl20.scalarMultiply((double) 100);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl49.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[] doubleArray57 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray58 = realMatrixImpl49.preMultiply(doubleArray57);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        double[] doubleArray60 = realMatrixImpl34.preMultiply(doubleArray57);
        boolean boolean61 = realMatrixImpl20.equals((java.lang.Object) doubleArray60);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray63 = realMatrixImpl16.solve(doubleArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double double20 = realMatrixImpl19.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.transpose();
        double[][] doubleArray22 = realMatrixImpl19.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl23.scalarMultiply((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl23.copy();
        double[][] doubleArray27 = realMatrixImpl23.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(3, (int) (short) 1);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray43 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray44 = realMatrixImpl35.preMultiply(doubleArray43);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        boolean boolean46 = realMatrixImpl45.isSingular();
        double[][] doubleArray47 = realMatrixImpl45.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        boolean boolean49 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl31.transpose();
        double[][] doubleArray51 = realMatrixImpl31.getDataRef();
        boolean boolean52 = realMatrixImpl31.isSingular();
        double[][] doubleArray53 = realMatrixImpl31.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl31.scalarAdd((double) (byte) 0);
        boolean boolean56 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl31);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray58 = realMatrixImpl31.getRow(10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.getRowMatrix((int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl32.copy();
        java.lang.String str39 = realMatrixImpl32.toString();
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray52 = realMatrixImpl43.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        boolean boolean54 = realMatrixImpl53.isSingular();
        double[][] doubleArray55 = realMatrixImpl53.getDataRef();
        java.lang.String str56 = realMatrixImpl53.toString();
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double double61 = realMatrixImpl60.getNorm();
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double double66 = realMatrixImpl65.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl65.transpose();
        double[] doubleArray69 = realMatrixImpl65.getColumn(0);
        double[] doubleArray70 = realMatrixImpl60.preMultiply(doubleArray69);
        double[] doubleArray71 = realMatrixImpl53.preMultiply(doubleArray69);
        double[] doubleArray72 = realMatrixImpl32.preMultiply(doubleArray69);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str39, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str56, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0]");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarMultiply((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.scalarMultiply((double) (byte) 1);
        int int14 = realMatrixImpl3.getRowDimension();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        boolean boolean34 = realMatrixImpl31.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl31.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl3.getSubMatrix(2, (int) (byte) 0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
    }
}

