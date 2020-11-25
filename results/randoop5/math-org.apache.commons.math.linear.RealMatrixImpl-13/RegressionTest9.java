import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
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
        java.lang.String str32 = realMatrixImpl16.toString();
        int int33 = realMatrixImpl16.getRowDimension();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str32, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl7.scalarAdd((double) '4');
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double double44 = realMatrixImpl43.getNorm();
        boolean boolean45 = realMatrixImpl43.isSingular();
        int int46 = realMatrixImpl43.getColumnDimension();
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[][] doubleArray56 = realMatrixImpl50.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[][] doubleArray58 = realMatrixImpl57.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        realMatrixImpl43.setSubMatrix(doubleArray58, (int) (byte) 0, 0);
        boolean boolean64 = realMatrixImpl7.equals((java.lang.Object) (byte) 0);
        int int65 = realMatrixImpl7.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl7.inverse();
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
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl28.scalarAdd(100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl28.copy();
        int int46 = realMatrixImpl28.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl28.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl28.inverse();
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
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(realMatrix47);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        boolean boolean10 = realMatrixImpl3.isSquare();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        boolean boolean20 = realMatrixImpl14.isSquare();
        int int21 = realMatrixImpl14.getColumnDimension();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray34 = realMatrixImpl25.preMultiply(doubleArray33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray36 = realMatrixImpl14.preMultiply(doubleArray33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        java.lang.String str38 = realMatrixImpl37.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl37.getRowMatrix(5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str38, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix39);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.scalarAdd((double) 0);
        int int19 = realMatrixImpl13.getColumnDimension();
        double[][] doubleArray20 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double double22 = realMatrixImpl21.getNorm();
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray34 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray35 = realMatrixImpl26.preMultiply(doubleArray34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        boolean boolean37 = realMatrixImpl36.isSingular();
        double[][] doubleArray38 = realMatrixImpl36.getDataRef();
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl46.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        boolean boolean58 = realMatrixImpl46.isSquare();
        int int59 = realMatrixImpl46.getColumnDimension();
        double[] doubleArray61 = realMatrixImpl46.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        double[] doubleArray63 = realMatrixImpl36.preMultiply(doubleArray61);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray66 = realMatrixImpl21.preMultiply(doubleArray63);
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
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0]");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 1L);
        boolean boolean12 = realMatrixImpl3.isSquare();
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[][] doubleArray17 = realMatrixImpl16.getDataRef();
        int int18 = realMatrixImpl16.getRowDimension();
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = realMatrixImpl16.preMultiply(doubleArray30);
        double[] doubleArray35 = realMatrixImpl3.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl36.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
        double[][] doubleArray28 = realMatrixImpl12.getData();
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
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl11.getColumnMatrix((int) (short) 0);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl21.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl11.multiply(realMatrix33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl11.transpose();
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl39.scalarMultiply((double) (short) 100);
        double[][] doubleArray42 = realMatrixImpl39.getDataRef();
        double double43 = realMatrixImpl39.getNorm();
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        double[] doubleArray55 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray56 = realMatrixImpl47.preMultiply(doubleArray55);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl57.scalarMultiply(100.0d);
        boolean boolean60 = realMatrixImpl39.equals((java.lang.Object) realMatrixImpl57);
        int int61 = realMatrixImpl57.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl11.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
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
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
        double[][] doubleArray28 = realMatrixImpl3.getData();
        int int29 = realMatrixImpl3.getRowDimension();
        int int30 = realMatrixImpl3.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = realMatrixImpl3.getEntry((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[] doubleArray7 = realMatrixImpl3.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl8.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl8.getRowMatrix((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl8.scalarAdd((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl8.getColumnMatrix(10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
        boolean boolean34 = realMatrixImpl20.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl20.scalarAdd(1.0d);
        double[][] doubleArray37 = realMatrixImpl20.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl20.scalarAdd((double) 0);
        double double40 = realMatrixImpl20.getNorm();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double double11 = realMatrixImpl10.getNorm();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double double16 = realMatrixImpl15.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.transpose();
        double[] doubleArray19 = realMatrixImpl15.getColumn(0);
        double[] doubleArray20 = realMatrixImpl10.preMultiply(doubleArray19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl21.transpose();
        boolean boolean23 = realMatrixImpl3.equals((java.lang.Object) realMatrix22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray36 = realMatrixImpl27.preMultiply(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarMultiply((double) (short) 100);
        double[] doubleArray45 = realMatrixImpl41.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray49 = realMatrixImpl3.getRow((int) (short) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double double51 = realMatrixImpl50.getDeterminant();
        double[][] doubleArray52 = realMatrixImpl50.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[][] doubleArray22 = realMatrixImpl21.getData();
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray34 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray35 = realMatrixImpl26.preMultiply(doubleArray34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        boolean boolean37 = realMatrixImpl36.isSingular();
        double double38 = realMatrixImpl36.getNorm();
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl46.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl36.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        boolean boolean59 = realMatrixImpl21.equals((java.lang.Object) realMatrix58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl21.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl6.preMultiply(realMatrix60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 11.0d + "'", double38 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(realMatrix60);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.scalarMultiply((double) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarMultiply(100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl3.transpose();
        double double13 = realMatrixImpl3.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '4', 3);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) (short) 1);
        double[][] doubleArray5 = realMatrixImpl2.getDataRef();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray18 = realMatrixImpl9.preMultiply(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        boolean boolean20 = realMatrixImpl19.isSquare();
        int int21 = realMatrixImpl19.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl19.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.scalarAdd((double) 0);
        int int25 = realMatrixImpl19.getColumnDimension();
        double[] doubleArray31 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl32.getRowMatrix(0);
        boolean boolean35 = realMatrixImpl32.isSingular();
        double[] doubleArray37 = realMatrixImpl32.getRow(3);
        double[] doubleArray38 = realMatrixImpl19.solve(doubleArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl2.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0]");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 5);
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
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl19.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl3.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
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
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        int int30 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl7.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl7.add(realMatrix33);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(realMatrix32);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
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
        double[][] doubleArray20 = realMatrixImpl7.getData();
        int int21 = realMatrixImpl7.getRowDimension();
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.getColumnMatrix((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl13.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl13.scalarAdd((double) (byte) 0);
        boolean boolean22 = realMatrixImpl13.isSingular();
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        boolean boolean29 = realMatrixImpl10.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl10.scalarAdd(12.0d);
        double[] doubleArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = realMatrixImpl10.solve(doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(realMatrix31);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
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
        // The following exception was thrown during execution in test generation
        try {
            double double88 = realMatrixImpl44.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
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
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        boolean boolean8 = realMatrixImpl7.isSingular();
        boolean boolean9 = realMatrixImpl7.isSingular();
        double[] doubleArray11 = realMatrixImpl7.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl12.copy();
        double double16 = realMatrixImpl12.getEntry((int) (short) 1, 0);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.transpose();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double double25 = realMatrixImpl24.getNorm();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        double[][] doubleArray71 = realMatrixImpl68.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        boolean boolean73 = realMatrixImpl72.isSingular();
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
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl13.transpose();
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
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarMultiply((double) (short) -1);
        double[][] doubleArray11 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[][] doubleArray14 = realMatrixImpl13.getData();
        double[][] doubleArray15 = realMatrixImpl13.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl13.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        java.lang.String str23 = realMatrixImpl7.toString();
        double[][] doubleArray24 = realMatrixImpl7.getDataRef();
        double[][] doubleArray25 = realMatrixImpl7.getData();
        boolean boolean26 = realMatrixImpl7.isSquare();
        double[][] doubleArray27 = realMatrixImpl7.getData();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str23, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl16.getRowMatrix((int) (short) 0);
        double double50 = realMatrixImpl16.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl16.luDecompose();
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
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        double[][] doubleArray10 = realMatrixImpl3.getDataRef();
        int int11 = realMatrixImpl3.getRowDimension();
        double[][] doubleArray12 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl13.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        int int8 = realMatrixImpl7.getColumnDimension();
        boolean boolean9 = realMatrixImpl7.isSquare();
        double[] doubleArray15 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        boolean boolean18 = realMatrixImpl17.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl17.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 1L);
        boolean boolean12 = realMatrixImpl3.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl3.scalarMultiply((double) (byte) 10);
        double[][] doubleArray16 = realMatrixImpl3.getDataRef();
        java.lang.String str17 = realMatrixImpl3.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str17, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
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
        boolean boolean17 = realMatrixImpl16.isSingular();
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray48 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray49 = realMatrixImpl40.preMultiply(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double double55 = realMatrixImpl54.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl54.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl61.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl70.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl65.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        double[] doubleArray79 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray83 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray83);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl80.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl84);
        double[] doubleArray88 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray89 = realMatrixImpl80.preMultiply(doubleArray88);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray88);
        double[] doubleArray91 = realMatrixImpl65.preMultiply(doubleArray88);
        double[] doubleArray92 = realMatrixImpl54.preMultiply(doubleArray88);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl93 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92);
        double[] doubleArray94 = realMatrixImpl16.operate(doubleArray92);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl95 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[1.0]");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        int int21 = realMatrixImpl20.getRowDimension();
        double[][] doubleArray22 = realMatrixImpl20.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[] doubleArray36 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray37 = realMatrixImpl28.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        int int41 = realMatrixImpl40.getColumnDimension();
        double[][] doubleArray42 = realMatrixImpl40.getData();
        double[][] doubleArray43 = realMatrixImpl40.getDataRef();
        double[][] doubleArray44 = realMatrixImpl40.getData();
        double[][] doubleArray45 = realMatrixImpl40.getData();
        int int46 = realMatrixImpl40.getRowDimension();
        boolean boolean47 = realMatrixImpl24.equals((java.lang.Object) int46);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = realMatrixImpl24.getRow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl56.scalarAdd((double) (byte) 1);
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
        org.junit.Assert.assertNotNull(realMatrix69);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[][] doubleArray4 = realMatrixImpl3.getDataRef();
        int int5 = realMatrixImpl3.getRowDimension();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray18 = realMatrixImpl9.preMultiply(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = realMatrixImpl3.preMultiply(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        boolean boolean24 = realMatrixImpl23.isSquare();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', 5);
        int[] intArray31 = new int[] { (short) 0, (short) 1, (byte) 1 };
        int[] intArray33 = new int[] { 2 };
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl27.getSubMatrix(intArray31, intArray33);
        int[] intArray35 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl23.getSubMatrix(intArray31, intArray35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: selected row and column index arrays must be non-empty");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[2]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray33 = realMatrixImpl24.preMultiply(doubleArray32);
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
        boolean boolean53 = realMatrixImpl41.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl24.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl41.scalarAdd((double) '#');
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix57);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl17.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl17.scalarMultiply((double) (byte) 100);
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
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        double[][] doubleArray15 = realMatrixImpl14.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl14.getRowMatrix(0);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.scalarAdd((double) (byte) 100);
        double[][] doubleArray20 = realMatrixImpl14.getData();
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
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray52 = realMatrixImpl43.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl37.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl37.scalarMultiply(0.0d);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double double60 = realMatrixImpl59.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.transpose();
        double[][] doubleArray62 = realMatrixImpl59.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        boolean boolean64 = realMatrixImpl37.equals((java.lang.Object) realMatrixImpl63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl63.transpose();
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double[] doubleArray72 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl69.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        double[] doubleArray77 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray78 = realMatrixImpl69.preMultiply(doubleArray77);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        double[] doubleArray81 = realMatrixImpl63.preMultiply(doubleArray77);
        double[] doubleArray82 = realMatrixImpl14.preMultiply(doubleArray77);
        boolean boolean83 = realMatrixImpl14.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl14.subtract(realMatrix84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray20);
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
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
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
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray33 = realMatrixImpl24.preMultiply(doubleArray32);
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
        boolean boolean53 = realMatrixImpl41.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl24.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double double56 = realMatrixImpl16.getNorm();
        double double57 = realMatrixImpl16.getNorm();
        int int58 = realMatrixImpl16.getColumnDimension();
        double[] doubleArray60 = realMatrixImpl16.getRow(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl16.getColumnMatrix(100);
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0]");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double double7 = realMatrixImpl3.getNorm();
        java.lang.String str8 = realMatrixImpl3.toString();
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str8, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl34.copy();
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
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl58.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl62);
        double[] doubleArray66 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray67 = realMatrixImpl58.preMultiply(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        double[] doubleArray71 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        double[] doubleArray75 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl72.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl76);
        boolean boolean78 = realMatrixImpl72.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl72.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl58.subtract(realMatrix80);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl58.scalarAdd((double) 10.0f);
        boolean boolean84 = realMatrixImpl34.equals((java.lang.Object) 10.0f);
        boolean boolean85 = realMatrixImpl34.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl34.transpose();
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
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(realMatrix86);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) '#');
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        java.lang.String str75 = realMatrixImpl32.toString();
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str75, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray20 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray21 = realMatrixImpl12.preMultiply(doubleArray20);
        boolean boolean22 = realMatrixImpl12.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl12.transpose();
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
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray55 = realMatrixImpl46.preMultiply(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl40.scalarMultiply(0.0d);
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        double double63 = realMatrixImpl62.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl62.transpose();
        double[][] doubleArray65 = realMatrixImpl62.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        boolean boolean67 = realMatrixImpl40.equals((java.lang.Object) realMatrixImpl66);
        double[][] doubleArray68 = realMatrixImpl66.getDataRef();
        boolean boolean69 = realMatrixImpl12.equals((java.lang.Object) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl8.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl66.getRowMatrix((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
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
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(realMatrix70);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl68.getSubMatrix((int) (byte) 0, (int) (byte) 0, 0, (int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl68.getRowMatrix(0);
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
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix78);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[] doubleArray7 = realMatrixImpl3.getColumn(0);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarMultiply((double) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl3.getRowMatrix((int) (byte) 0);
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
        int int33 = realMatrixImpl20.getColumnDimension();
        double[] doubleArray35 = realMatrixImpl20.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl20.scalarMultiply((double) (byte) 100);
        int int38 = realMatrixImpl20.getColumnDimension();
        double[][] doubleArray39 = realMatrixImpl20.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        boolean boolean50 = realMatrixImpl48.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl48.scalarMultiply((double) 100L);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double double57 = realMatrixImpl56.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        int int59 = realMatrixImpl48.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl20.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(realMatrix60);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
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
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray24 = realMatrixImpl18.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[] doubleArray56 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray57 = realMatrixImpl48.preMultiply(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl42.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl62.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        boolean boolean68 = realMatrixImpl62.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl62.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl48.subtract(realMatrix70);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) (byte) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl75.getRowMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl25.multiply(realMatrix77);
        boolean boolean79 = realMatrixImpl3.equals((java.lang.Object) realMatrix78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl3.transpose();
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(realMatrix80);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double double45 = realMatrixImpl44.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.transpose();
        double[] doubleArray48 = realMatrixImpl44.getColumn(0);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl44.scalarMultiply((double) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
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
        boolean boolean72 = realMatrixImpl60.isSquare();
        double double73 = realMatrixImpl60.getNorm();
        double[] doubleArray79 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        boolean boolean82 = realMatrixImpl60.equals((java.lang.Object) realMatrixImpl81);
        int int83 = realMatrixImpl81.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl81);
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
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 5 + "'", int83 == 5);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[][] doubleArray11 = realMatrixImpl10.getData();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double double16 = realMatrixImpl15.getNorm();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double double21 = realMatrixImpl20.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.transpose();
        double[] doubleArray24 = realMatrixImpl20.getColumn(0);
        double[] doubleArray25 = realMatrixImpl15.preMultiply(doubleArray24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        boolean boolean27 = realMatrixImpl26.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.copy();
        boolean boolean29 = realMatrixImpl26.isSquare();
        int int30 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(realMatrix31);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
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
        int int25 = realMatrixImpl24.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            double double28 = realMatrixImpl24.getEntry((int) (short) 10, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double double22 = realMatrixImpl21.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl21.transpose();
        double[] doubleArray25 = realMatrixImpl21.getColumn(0);
        double[] doubleArray26 = realMatrixImpl16.preMultiply(doubleArray25);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl27.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.copy();
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        boolean boolean39 = realMatrixImpl33.isSquare();
        int int40 = realMatrixImpl33.getColumnDimension();
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray55 = realMatrixImpl33.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray57 = realMatrixImpl27.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl27.getRowMatrix(0);
        double[][] doubleArray60 = realMatrixImpl27.getDataRef();
        double double61 = realMatrixImpl27.getNorm();
        double[][] doubleArray62 = realMatrixImpl27.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl7.setSubMatrix(doubleArray62, 2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
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
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        boolean boolean26 = realMatrixImpl14.isSquare();
        double double27 = realMatrixImpl14.getNorm();
        boolean boolean28 = realMatrixImpl14.isSingular();
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl36.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        double[] doubleArray59 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray60 = realMatrixImpl51.preMultiply(doubleArray59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray62 = realMatrixImpl36.preMultiply(doubleArray59);
        double[] doubleArray63 = realMatrixImpl14.preMultiply(doubleArray59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        boolean boolean65 = realMatrixImpl64.isSingular();
        double[][] doubleArray66 = realMatrixImpl64.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl64.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl3.subtract(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
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
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray58 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray59 = realMatrixImpl50.preMultiply(doubleArray58);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        boolean boolean61 = realMatrixImpl60.isSingular();
        double[][] doubleArray62 = realMatrixImpl60.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        double double64 = realMatrixImpl63.getNorm();
        double[][] doubleArray65 = realMatrixImpl63.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl45.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl67);
        double[][] doubleArray69 = realMatrixImpl67.getDataRef();
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
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 11.0d + "'", double64 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(doubleArray69);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl15.scalarAdd((double) 1.0f);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', 5);
        int[] intArray54 = new int[] { (short) 0, (short) 1, (byte) 1 };
        int[] intArray56 = new int[] { 2 };
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl50.getSubMatrix(intArray54, intArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', 5);
        int[] intArray64 = new int[] { (short) 0, (short) 1, (byte) 1 };
        int[] intArray66 = new int[] { 2 };
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl60.getSubMatrix(intArray64, intArray66);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl15.getSubMatrix(intArray54, intArray64);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[2]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[2]");
        org.junit.Assert.assertNotNull(realMatrix67);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
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
        boolean boolean25 = realMatrixImpl13.isSquare();
        int int26 = realMatrixImpl13.getColumnDimension();
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
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double double47 = realMatrixImpl13.getNorm();
        boolean boolean48 = realMatrixImpl13.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray51 = realMatrixImpl13.getRow((int) (byte) 1);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        boolean boolean61 = realMatrixImpl55.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl55.scalarAdd((double) (short) -1);
        double double64 = realMatrixImpl55.getNorm();
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        double double69 = realMatrixImpl68.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl68.transpose();
        double[][] doubleArray71 = realMatrixImpl68.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl55.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        double[][] doubleArray75 = realMatrixImpl72.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
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
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray75);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', 2);
        double[] doubleArray5 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.scalarMultiply((double) (short) 100);
        boolean boolean9 = realMatrixImpl6.isSingular();
        double[][] doubleArray10 = realMatrixImpl6.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl6.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl2.solve(realMatrix11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect row dimension");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl16.getSubMatrix((int) (short) 0, 97, (-1), (int) (short) 10);
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
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.transpose();
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
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
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
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.transpose();
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
        boolean boolean43 = realMatrixImpl31.isSquare();
        double double44 = realMatrixImpl31.getNorm();
        double[] doubleArray50 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        boolean boolean53 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl52);
        int int54 = realMatrixImpl31.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl31.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl31.scalarAdd((double) (short) 1);
        boolean boolean59 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl31);
        boolean boolean60 = realMatrixImpl7.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray62 = realMatrixImpl7.getRow((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
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
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl30.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        boolean boolean42 = realMatrixImpl30.isSquare();
        double double43 = realMatrixImpl30.getNorm();
        double[] doubleArray49 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        boolean boolean52 = realMatrixImpl30.equals((java.lang.Object) realMatrixImpl51);
        boolean boolean53 = realMatrixImpl51.isSingular();
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        double double71 = realMatrixImpl70.getNorm();
        double[][] doubleArray72 = realMatrixImpl70.getDataRef();
        boolean boolean73 = realMatrixImpl51.equals((java.lang.Object) doubleArray72);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
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
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 11.0d + "'", double71 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.transpose();
        java.lang.String str9 = realMatrixImpl3.toString();
        boolean boolean10 = realMatrixImpl3.isSquare();
        boolean boolean11 = realMatrixImpl3.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        boolean boolean21 = realMatrixImpl16.isSquare();
        double[][] doubleArray22 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl16.scalarAdd((double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        int int7 = realMatrixImpl3.getRowDimension();
        int int8 = realMatrixImpl3.getColumnDimension();
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
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray39 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray40 = realMatrixImpl31.preMultiply(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[][] doubleArray42 = realMatrixImpl31.getData();
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
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl65.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        double[] doubleArray73 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray74 = realMatrixImpl65.preMultiply(doubleArray73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double[] doubleArray76 = realMatrixImpl50.preMultiply(doubleArray73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        boolean boolean78 = realMatrixImpl77.isSquare();
        boolean boolean79 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl77);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl3.scalarMultiply(12.0d);
        int int83 = realMatrixImpl3.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
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
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
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
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl23.copy();
        int int30 = realMatrixImpl23.getRowDimension();
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
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl3.transpose();
        double[][] doubleArray5 = realMatrixImpl3.getDataRef();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double double10 = realMatrixImpl9.getNorm();
        double[][] doubleArray11 = realMatrixImpl9.getDataRef();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[] doubleArray23 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray24 = realMatrixImpl15.preMultiply(doubleArray23);
        boolean boolean25 = realMatrixImpl15.isSingular();
        double[] doubleArray27 = realMatrixImpl15.getColumn((int) (byte) 0);
        double[] doubleArray28 = realMatrixImpl9.preMultiply(doubleArray27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = realMatrixImpl3.preMultiply(doubleArray27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0]");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = realMatrixImpl13.getRow((int) (byte) 10);
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
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 1L);
        double[][] doubleArray12 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl21);
        boolean boolean23 = realMatrixImpl17.isSquare();
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
        boolean boolean43 = realMatrixImpl31.isSquare();
        double double44 = realMatrixImpl31.getNorm();
        boolean boolean45 = realMatrixImpl17.equals((java.lang.Object) double44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl17.scalarMultiply((double) 0L);
        boolean boolean48 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl17);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = realMatrixImpl17.getRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
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
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double double11 = realMatrixImpl10.getNorm();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double double16 = realMatrixImpl15.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.transpose();
        double[] doubleArray19 = realMatrixImpl15.getColumn(0);
        double[] doubleArray20 = realMatrixImpl10.preMultiply(doubleArray19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl21.transpose();
        boolean boolean23 = realMatrixImpl3.equals((java.lang.Object) realMatrix22);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl3.scalarMultiply((double) (-1));
        int int26 = realMatrixImpl3.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = realMatrixImpl3.getRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        int int8 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.copy();
        double[] doubleArray11 = realMatrixImpl7.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray24 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray25 = realMatrixImpl16.preMultiply(doubleArray24);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        boolean boolean27 = realMatrixImpl26.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.transpose();
        double[][] doubleArray29 = realMatrixImpl26.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
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
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray29);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
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
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double double53 = realMatrixImpl52.getNorm();
        boolean boolean54 = realMatrixImpl52.isSingular();
        int int55 = realMatrixImpl52.getColumnDimension();
        java.lang.Class<?> wildcardClass56 = realMatrixImpl52.getClass();
        boolean boolean57 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl52);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl61.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl70.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl65.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        boolean boolean77 = realMatrixImpl65.isSquare();
        double double78 = realMatrixImpl65.getNorm();
        double[] doubleArray80 = realMatrixImpl65.getRow((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray81 = realMatrixImpl52.solve(doubleArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
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
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0]");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl7.scalarMultiply((double) (byte) 100);
        int int25 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray26 = realMatrixImpl7.getData();
        double double27 = realMatrixImpl7.getNorm();
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
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
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
        double[][] doubleArray32 = realMatrixImpl16.getData();
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double double37 = realMatrixImpl36.getNorm();
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double double42 = realMatrixImpl41.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.transpose();
        double[] doubleArray45 = realMatrixImpl41.getColumn(0);
        double[] doubleArray46 = realMatrixImpl36.preMultiply(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl36.scalarAdd((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl36.copy();
        double[][] doubleArray50 = realMatrixImpl36.getDataRef();
        double[][] doubleArray51 = realMatrixImpl36.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl36.copy();
        boolean boolean53 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl36);
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
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl3.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.scalarMultiply((double) 100);
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
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray41 = realMatrixImpl32.preMultiply(doubleArray40);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray43 = realMatrixImpl17.preMultiply(doubleArray40);
        boolean boolean44 = realMatrixImpl3.equals((java.lang.Object) doubleArray43);
        // The following exception was thrown during execution in test generation
        try {
            double double47 = realMatrixImpl3.getEntry((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double double7 = realMatrixImpl3.getNorm();
        java.lang.String str8 = realMatrixImpl3.toString();
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray20 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray21 = realMatrixImpl12.preMultiply(doubleArray20);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        java.lang.String str23 = realMatrixImpl22.toString();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarMultiply((double) (short) 100);
        double[][] doubleArray30 = realMatrixImpl27.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double double32 = realMatrixImpl22.getNorm();
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double double52 = realMatrixImpl40.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl40.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl40.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[][] doubleArray57 = realMatrixImpl22.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl22.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str8, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str23, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 11.0d + "'", double32 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertNotNull(realMatrix58);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl24.getColumnMatrix((int) (short) 1);
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
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[][] doubleArray5 = realMatrixImpl3.getDataRef();
        double[] doubleArray7 = realMatrixImpl3.getRow(1);
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double double12 = realMatrixImpl11.getNorm();
        boolean boolean13 = realMatrixImpl11.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl11.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl11.scalarMultiply((double) 100);
        java.lang.String str18 = realMatrixImpl11.toString();
        double[][] doubleArray19 = realMatrixImpl11.getData();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl3.setSubMatrix(doubleArray19, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str18, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl22.scalarMultiply((double) (-1));
        java.lang.String str50 = realMatrixImpl22.toString();
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl54.transpose();
        double[][] doubleArray56 = realMatrixImpl54.getDataRef();
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double double61 = realMatrixImpl60.getNorm();
        double[][] doubleArray62 = realMatrixImpl60.getDataRef();
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        double[] doubleArray74 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray75 = realMatrixImpl66.preMultiply(doubleArray74);
        boolean boolean76 = realMatrixImpl66.isSingular();
        double[] doubleArray78 = realMatrixImpl66.getColumn((int) (byte) 0);
        double[] doubleArray79 = realMatrixImpl60.preMultiply(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        double[] doubleArray82 = realMatrixImpl54.preMultiply(doubleArray78);
        double[] doubleArray83 = realMatrixImpl22.preMultiply(doubleArray78);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl22.getSubMatrix((int) '#', (-1), (int) (byte) 1, (int) (byte) 1);
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str50, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0]");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
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
        java.lang.String str27 = realMatrixImpl26.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.transpose();
        boolean boolean29 = realMatrixImpl26.isSquare();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str27, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
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
        java.lang.String str27 = realMatrixImpl26.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.copy();
        int int29 = realMatrixImpl26.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl26.getSubMatrix((int) (byte) 0, 1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str27, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.getColumnMatrix((int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        int int45 = realMatrixImpl42.getRowDimension();
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl49.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[][] doubleArray55 = realMatrixImpl49.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        boolean boolean57 = realMatrixImpl56.isSquare();
        double double58 = realMatrixImpl56.getNorm();
        boolean boolean59 = realMatrixImpl42.equals((java.lang.Object) realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.getColumnMatrix(0);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(realMatrix61);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
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
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
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
        double[] doubleArray44 = realMatrixImpl13.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl13.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl13.copy();
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
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        boolean boolean8 = realMatrixImpl3.isSquare();
        java.lang.String str9 = realMatrixImpl3.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 100);
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
        int int28 = realMatrixImpl25.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.scalarMultiply((double) 5);
        double[][] doubleArray31 = realMatrixImpl25.getDataRef();
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray43 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray44 = realMatrixImpl35.preMultiply(doubleArray43);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl49.scalarMultiply((double) (short) 100);
        double[] doubleArray53 = realMatrixImpl49.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        boolean boolean66 = realMatrixImpl60.isSquare();
        int int67 = realMatrixImpl60.getColumnDimension();
        double[] doubleArray70 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl71.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        double[] doubleArray79 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray80 = realMatrixImpl71.preMultiply(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray82 = realMatrixImpl60.preMultiply(doubleArray79);
        double[] doubleArray83 = realMatrixImpl45.preMultiply(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[101.0]");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        double double40 = realMatrixImpl30.getTrace();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl30.inverse();
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix41);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        java.lang.String str21 = realMatrixImpl20.toString();
        double[][] doubleArray22 = realMatrixImpl20.getData();
        double[][] doubleArray23 = realMatrixImpl20.getData();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str21, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
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
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl28.scalarMultiply((double) 0.0f);
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
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        boolean boolean9 = realMatrixImpl8.isSingular();
        java.lang.String str10 = realMatrixImpl8.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str10, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl14.copy();
        double[][] doubleArray17 = realMatrixImpl14.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.scalarMultiply((double) (byte) 1);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[][] doubleArray5 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        double[][] doubleArray8 = realMatrixImpl7.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        boolean boolean11 = realMatrixImpl10.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
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
        java.lang.String str47 = realMatrixImpl42.toString();
        boolean boolean48 = realMatrixImpl42.isSquare();
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
        double double68 = realMatrixImpl56.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl56.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl56.scalarMultiply((double) (short) 10);
        boolean boolean72 = realMatrixImpl56.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl56.scalarMultiply(300.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl42.add(realMatrix74);
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str47, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
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
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.scalarAdd(0.0d);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl12);
        boolean boolean19 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl3.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl3.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        boolean boolean11 = realMatrixImpl10.isSquare();
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
        double double31 = realMatrixImpl19.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        boolean boolean33 = realMatrixImpl19.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl19.scalarMultiply((double) 3);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl19.scalarAdd((double) 100.0f);
        boolean boolean38 = realMatrixImpl19.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        boolean boolean26 = realMatrixImpl14.isSquare();
        double double27 = realMatrixImpl14.getNorm();
        double[] doubleArray33 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        boolean boolean36 = realMatrixImpl14.equals((java.lang.Object) realMatrixImpl35);
        int int37 = realMatrixImpl14.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl14.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        boolean boolean41 = realMatrixImpl14.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl14.scalarAdd((double) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[][] doubleArray4 = realMatrixImpl3.getDataRef();
        int int5 = realMatrixImpl3.getRowDimension();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray18 = realMatrixImpl9.preMultiply(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = realMatrixImpl3.preMultiply(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl3.transpose();
        int int23 = realMatrixImpl3.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl3.scalarMultiply((double) 2);
        double[] doubleArray31 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray37 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray43 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray44 = new double[][] { doubleArray31, doubleArray37, doubleArray43 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        int int47 = realMatrixImpl46.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl46.scalarAdd(300.0d);
        double double52 = realMatrixImpl46.getEntry(0, (int) (short) 1);
        boolean boolean54 = realMatrixImpl46.equals((java.lang.Object) (-1.0f));
        boolean boolean55 = realMatrixImpl3.equals((java.lang.Object) boolean54);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        int int8 = realMatrixImpl7.getColumnDimension();
        int int9 = realMatrixImpl7.getColumnDimension();
        double double10 = realMatrixImpl7.getNorm();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double double15 = realMatrixImpl14.getNorm();
        boolean boolean16 = realMatrixImpl14.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl14.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl14.scalarMultiply((double) 100);
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
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray52 = realMatrixImpl43.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray54 = realMatrixImpl28.preMultiply(doubleArray51);
        boolean boolean55 = realMatrixImpl14.equals((java.lang.Object) doubleArray54);
        boolean boolean56 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl14);
        double double57 = realMatrixImpl14.getNorm();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 12.0d + "'", double10 == 12.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
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
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) (short) -1);
        double double12 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl3.scalarAdd(100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl3.scalarAdd((double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl3.scalarMultiply((double) 1L);
        int int19 = realMatrixImpl3.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
        double[][] doubleArray36 = realMatrixImpl13.getData();
        double[][] doubleArray37 = realMatrixImpl13.getData();
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double[][] doubleArray47 = realMatrixImpl41.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
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
        double double70 = realMatrixImpl58.getNorm();
        int int71 = realMatrixImpl58.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl58.copy();
        int int73 = realMatrixImpl58.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl58.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl58.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
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
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(realMatrix50);
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
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[][] doubleArray4 = realMatrixImpl3.getDataRef();
        int int5 = realMatrixImpl3.getRowDimension();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray18 = realMatrixImpl9.preMultiply(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = realMatrixImpl3.preMultiply(doubleArray17);
        boolean boolean22 = realMatrixImpl3.isSingular();
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double double27 = realMatrixImpl26.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.transpose();
        double[][] doubleArray29 = realMatrixImpl26.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray34 = realMatrixImpl32.getColumn(0);
        boolean boolean35 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl3.getRowMatrix(97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl13.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl13.transpose();
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        double[] doubleArray29 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray30 = realMatrixImpl21.preMultiply(doubleArray29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        java.lang.String str32 = realMatrixImpl31.toString();
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.scalarMultiply((double) (short) 100);
        double[][] doubleArray39 = realMatrixImpl36.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(3, (int) (short) 1);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        double[] doubleArray55 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray56 = realMatrixImpl47.preMultiply(doubleArray55);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        boolean boolean58 = realMatrixImpl57.isSingular();
        double[][] doubleArray59 = realMatrixImpl57.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        boolean boolean61 = realMatrixImpl43.equals((java.lang.Object) realMatrixImpl60);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl43.scalarAdd((double) 10L);
        boolean boolean64 = realMatrixImpl36.equals((java.lang.Object) 10L);
        double[][] doubleArray65 = realMatrixImpl36.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl36.scalarAdd((double) 1);
        double[] doubleArray70 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        double double72 = realMatrixImpl71.getNorm();
        boolean boolean73 = realMatrixImpl71.isSingular();
        int int74 = realMatrixImpl71.getColumnDimension();
        double[][] doubleArray75 = realMatrixImpl71.getDataRef();
        boolean boolean76 = realMatrixImpl71.isSingular();
        java.lang.String str77 = realMatrixImpl71.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl71);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl13.add(realMatrix78);
        int int80 = realMatrixImpl13.getColumnDimension();
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str32, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str77, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        double[][] doubleArray10 = realMatrixImpl3.getDataRef();
        int int11 = realMatrixImpl3.getRowDimension();
        double[][] doubleArray12 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        boolean boolean33 = realMatrixImpl21.isSquare();
        double double34 = realMatrixImpl21.getNorm();
        boolean boolean35 = realMatrixImpl21.isSquare();
        boolean boolean36 = realMatrixImpl21.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl21.scalarMultiply((double) 100.0f);
        double double39 = realMatrixImpl21.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl13.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl42.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[] doubleArray65 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray66 = realMatrixImpl57.preMultiply(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        double[][] doubleArray68 = realMatrixImpl51.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double double70 = realMatrixImpl69.getNorm();
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double[] doubleArray77 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl74.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl78);
        double[] doubleArray82 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray83 = realMatrixImpl74.preMultiply(doubleArray82);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray83);
        boolean boolean85 = realMatrixImpl84.isSquare();
        int int86 = realMatrixImpl84.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl69.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl84);
        boolean boolean88 = realMatrixImpl34.equals((java.lang.Object) realMatrixImpl84);
        double double89 = realMatrixImpl84.getNorm();
        double[][] doubleArray90 = realMatrixImpl84.getDataRef();
        int int91 = realMatrixImpl84.getColumnDimension();
        double[][] doubleArray92 = realMatrixImpl84.getDataRef();
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
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 1.0d + "'", double89 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(doubleArray92);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarMultiply((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl3.transpose();
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        boolean boolean18 = realMatrixImpl16.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl16.scalarMultiply((double) 100);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl30.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray53 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray54 = realMatrixImpl45.preMultiply(doubleArray53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double[] doubleArray56 = realMatrixImpl30.preMultiply(doubleArray53);
        boolean boolean57 = realMatrixImpl16.equals((java.lang.Object) doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray59 = realMatrixImpl3.operate(doubleArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarMultiply((double) (short) -1);
        double double13 = realMatrixImpl3.getEntry((int) (short) 0, (int) (short) 0);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray44 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray45 = realMatrixImpl36.preMultiply(doubleArray44);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray47 = realMatrixImpl21.preMultiply(doubleArray44);
        double[] doubleArray48 = realMatrixImpl3.preMultiply(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl3.getRowMatrix(0);
        int int51 = realMatrixImpl3.getColumnDimension();
        int int52 = realMatrixImpl3.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
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
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
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
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.scalarMultiply((double) (short) 100);
        double[][] doubleArray19 = realMatrixImpl16.getDataRef();
        double[][] doubleArray20 = realMatrixImpl16.getDataRef();
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
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray52 = realMatrixImpl43.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray54 = realMatrixImpl28.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl28.scalarMultiply((double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        boolean boolean58 = realMatrixImpl16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl16.scalarMultiply((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl3.preMultiply(realMatrix60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray20);
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
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(realMatrix60);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
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
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl7.getRowMatrix((int) (byte) 1);
        boolean boolean44 = realMatrixImpl7.isSquare();
        double[][] doubleArray45 = realMatrixImpl7.getDataRef();
        int int46 = realMatrixImpl7.getRowDimension();
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
        boolean boolean66 = realMatrixImpl54.isSquare();
        int int67 = realMatrixImpl54.getColumnDimension();
        double[] doubleArray69 = realMatrixImpl54.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        double[] doubleArray72 = realMatrixImpl70.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl70.scalarAdd((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl7.add(realMatrix74);
        double[] doubleArray78 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        double double80 = realMatrixImpl79.getNorm();
        boolean boolean81 = realMatrixImpl79.isSingular();
        int int82 = realMatrixImpl79.getColumnDimension();
        double[][] doubleArray83 = realMatrixImpl79.getDataRef();
        double[][] doubleArray84 = realMatrixImpl79.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray84);
        double[][] doubleArray86 = realMatrixImpl85.getData();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl7.setSubMatrix(doubleArray86, 0, 10);
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
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(doubleArray86);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
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
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl7.scalarMultiply((double) 100);
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
        boolean boolean55 = realMatrixImpl52.isSquare();
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double double60 = realMatrixImpl59.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.transpose();
        double[][] doubleArray62 = realMatrixImpl59.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl63.scalarMultiply((double) (byte) 100);
        boolean boolean66 = realMatrixImpl52.equals((java.lang.Object) realMatrix65);
        int int67 = realMatrixImpl52.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[][] doubleArray69 = realMatrixImpl7.getData();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray71 = realMatrixImpl7.getRow(100);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(doubleArray69);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        double[][] doubleArray44 = realMatrixImpl42.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl42.scalarMultiply(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl42.getSubMatrix(100, (int) (short) 100, (int) (byte) 10, (int) '4');
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
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(realMatrix46);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
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
        double[][] doubleArray56 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
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
        org.junit.Assert.assertNotNull(doubleArray56);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
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
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl16.scalarAdd((double) 10);
        double[] doubleArray40 = realMatrixImpl16.getRow(0);
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
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0]");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
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
        boolean boolean38 = realMatrixImpl37.isSingular();
        double double39 = realMatrixImpl37.getNorm();
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        boolean boolean20 = realMatrixImpl19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl19.scalarMultiply((double) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.getColumnMatrix((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        // The following exception was thrown during execution in test generation
        try {
            double double51 = realMatrixImpl13.getEntry(0, 10);
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
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl3.getRowMatrix((int) (byte) 0);
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        boolean boolean16 = realMatrixImpl14.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.scalarMultiply(11.0d);
        double[][] doubleArray20 = realMatrixImpl14.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        int int18 = realMatrixImpl13.getColumnDimension();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        int int18 = realMatrixImpl16.getRowDimension();
        java.lang.String str19 = realMatrixImpl16.toString();
        double[][] doubleArray20 = realMatrixImpl16.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str19, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
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
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray48 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray49 = realMatrixImpl40.preMultiply(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl54.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        boolean boolean60 = realMatrixImpl54.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl54.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl40.subtract(realMatrix62);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl40.scalarAdd((double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl40.scalarMultiply((double) (-1));
        boolean boolean68 = realMatrixImpl13.equals((java.lang.Object) realMatrix67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl13.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl13.transpose();
        int int71 = realMatrixImpl13.getColumnDimension();
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        int int8 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.copy();
        double[] doubleArray11 = realMatrixImpl7.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl7.scalarAdd((double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        boolean boolean8 = realMatrixImpl7.isSingular();
        boolean boolean9 = realMatrixImpl7.isSingular();
        double[] doubleArray11 = realMatrixImpl7.getColumn((int) (byte) 0);
        boolean boolean12 = realMatrixImpl7.isSingular();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[][] doubleArray4 = realMatrixImpl3.getDataRef();
        int int5 = realMatrixImpl3.getRowDimension();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray18 = realMatrixImpl9.preMultiply(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = realMatrixImpl3.preMultiply(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl3.transpose();
        double double23 = realMatrixImpl3.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        double[][] doubleArray22 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl16.scalarMultiply((double) (short) 0);
        java.lang.String str25 = realMatrixImpl16.toString();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl16.luDecompose();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str25, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl3.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.scalarMultiply((double) 100);
        java.lang.String str10 = realMatrixImpl3.toString();
        double[][] doubleArray11 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.Class<?> wildcardClass13 = realMatrixImpl12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str10, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
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
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl68.getRowMatrix(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl68.getSubMatrix((int) (short) 1, (int) (byte) 100, (int) (byte) 100, 10);
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
        org.junit.Assert.assertNotNull(realMatrix73);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
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
        double double36 = realMatrixImpl34.getDeterminant();
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray11 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.getColumnMatrix((int) (byte) 0);
        java.lang.String str14 = realMatrixImpl3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl3.inverse();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str14, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        boolean boolean8 = realMatrixImpl3.isSingular();
        java.lang.String str9 = realMatrixImpl3.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        int int84 = realMatrixImpl70.getColumnDimension();
        boolean boolean85 = realMatrixImpl70.isSquare();
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
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[] doubleArray7 = realMatrixImpl3.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl8.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl8.getColumnMatrix((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl3.copy();
        double double8 = realMatrixImpl3.getNorm();
        java.lang.String str9 = realMatrixImpl3.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.scalarMultiply((double) (short) 0);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double double14 = realMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double double19 = realMatrixImpl18.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.transpose();
        double[] doubleArray22 = realMatrixImpl18.getColumn(0);
        double[] doubleArray23 = realMatrixImpl13.preMultiply(doubleArray22);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = realMatrixImpl3.solve(doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl53.getRowMatrix((int) 'a');
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
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
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
        double[][] doubleArray47 = realMatrixImpl18.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', (int) (short) 100);
        int int51 = realMatrixImpl50.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
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
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
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
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double double53 = realMatrixImpl52.getNorm();
        boolean boolean54 = realMatrixImpl52.isSingular();
        int int55 = realMatrixImpl52.getColumnDimension();
        java.lang.Class<?> wildcardClass56 = realMatrixImpl52.getClass();
        boolean boolean57 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl52);
        double[][] doubleArray58 = realMatrixImpl52.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
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
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleArray58);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) (short) -1);
        double double12 = realMatrixImpl3.getNorm();
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        boolean boolean18 = realMatrixImpl16.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl16.scalarMultiply((double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl16.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl3.subtract(realMatrix23);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl3.getRowMatrix(0);
        java.lang.String str27 = realMatrixImpl3.toString();
        double[] doubleArray29 = realMatrixImpl3.getRow((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str27, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0]");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
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
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl13.scalarMultiply((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double46 = realMatrixImpl13.getEntry((-1), (int) ' ');
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
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[][] doubleArray5 = realMatrixImpl3.getDataRef();
        boolean boolean6 = realMatrixImpl3.isSquare();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray20 = realMatrixImpl11.preMultiply(doubleArray19);
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
        boolean boolean40 = realMatrixImpl28.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl11.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl28.transpose();
        double[] doubleArray44 = realMatrixImpl28.getRow((int) (byte) 0);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean54 = realMatrixImpl48.isSquare();
        int int55 = realMatrixImpl48.getColumnDimension();
        double double56 = realMatrixImpl48.getNorm();
        boolean boolean57 = realMatrixImpl28.equals((java.lang.Object) realMatrixImpl48);
        boolean boolean58 = realMatrixImpl48.isSingular();
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl62.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        double[] doubleArray70 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl71.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl66.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        double[] doubleArray80 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        double[] doubleArray84 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray84);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl81.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl85);
        double[] doubleArray89 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray90 = realMatrixImpl81.preMultiply(doubleArray89);
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl75.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl81);
        double[][] doubleArray92 = realMatrixImpl81.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl93 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray92);
        boolean boolean95 = realMatrixImpl48.equals((java.lang.Object) realMatrixImpl94);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl3.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[][] doubleArray5 = realMatrixImpl3.getDataRef();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray18 = realMatrixImpl9.preMultiply(doubleArray17);
        boolean boolean19 = realMatrixImpl9.isSingular();
        double[] doubleArray21 = realMatrixImpl9.getColumn((int) (byte) 0);
        double[] doubleArray22 = realMatrixImpl3.preMultiply(doubleArray21);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.transpose();
        boolean boolean14 = realMatrixImpl3.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
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
        double[][] doubleArray16 = realMatrixImpl13.getDataRef();
        realMatrixImpl13.luDecompose();
        double double18 = realMatrixImpl13.getNorm();
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray52 = realMatrixImpl26.preMultiply(doubleArray49);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        boolean boolean54 = realMatrixImpl13.equals((java.lang.Object) doubleArray49);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
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
        int int76 = realMatrixImpl63.getColumnDimension();
        double[] doubleArray78 = realMatrixImpl63.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl63.scalarMultiply((double) 0.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl63.getColumnMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl63.scalarAdd(12.0d);
        double[] doubleArray86 = realMatrixImpl63.getRow(1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray86);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray88 = realMatrixImpl55.preMultiply(doubleArray86);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
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
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[1.0]");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.scalarMultiply((double) (short) 0);
        java.lang.String str10 = realMatrixImpl3.toString();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl27.transpose();
        double[][] doubleArray29 = realMatrixImpl27.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl3.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str10, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(realMatrix30);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
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
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray48 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray49 = realMatrixImpl40.preMultiply(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl54.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        boolean boolean60 = realMatrixImpl54.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl54.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl40.subtract(realMatrix62);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl40.scalarAdd((double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl40.scalarMultiply((double) (-1));
        boolean boolean68 = realMatrixImpl13.equals((java.lang.Object) realMatrix67);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl13.scalarMultiply((double) (-1L));
        java.lang.Class<?> wildcardClass71 = realMatrix70.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
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
        java.lang.String str52 = realMatrixImpl44.toString();
        java.lang.Class<?> wildcardClass53 = realMatrixImpl44.getClass();
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str52, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
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
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double double25 = realMatrixImpl24.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl24.transpose();
        double[][] doubleArray27 = realMatrixImpl24.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.scalarAdd(0.0d);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[][] doubleArray41 = realMatrixImpl24.getData();
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
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
        double[][] doubleArray56 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl13.copy();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl13.luDecompose();
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
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(realMatrix57);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        int int8 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl7.scalarAdd((double) 1L);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) (-1));
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
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray43 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray44 = realMatrixImpl35.preMultiply(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl29.scalarMultiply(0.0d);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double double52 = realMatrixImpl51.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl51.transpose();
        double[][] doubleArray54 = realMatrixImpl51.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        boolean boolean56 = realMatrixImpl29.equals((java.lang.Object) realMatrixImpl55);
        boolean boolean57 = realMatrixImpl55.isSquare();
        int int58 = realMatrixImpl55.getRowDimension();
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl62.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        double[][] doubleArray68 = realMatrixImpl62.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        boolean boolean70 = realMatrixImpl69.isSquare();
        double double71 = realMatrixImpl69.getNorm();
        boolean boolean72 = realMatrixImpl55.equals((java.lang.Object) realMatrixImpl69);
        java.lang.String str73 = realMatrixImpl69.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl69.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl7.multiply(realMatrix74);
        boolean boolean76 = realMatrixImpl7.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
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
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str73, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[][] doubleArray5 = realMatrixImpl3.getDataRef();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray18 = realMatrixImpl9.preMultiply(doubleArray17);
        boolean boolean19 = realMatrixImpl9.isSingular();
        double[] doubleArray21 = realMatrixImpl9.getColumn((int) (byte) 0);
        double[] doubleArray22 = realMatrixImpl3.preMultiply(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl3.scalarAdd(300.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl3.transpose();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[][] doubleArray29 = realMatrixImpl28.getData();
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
        boolean boolean49 = realMatrixImpl37.isSquare();
        int int50 = realMatrixImpl37.getColumnDimension();
        double[] doubleArray52 = realMatrixImpl37.getColumn((int) (byte) 0);
        boolean boolean53 = realMatrixImpl28.equals((java.lang.Object) doubleArray52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl3.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray29);
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl10.copy();
        int int12 = realMatrixImpl10.getRowDimension();
        int int13 = realMatrixImpl10.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }
}

