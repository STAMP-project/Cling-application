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
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.scalarAdd((double) '#');
        double[] doubleArray49 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl50.scalarAdd((double) '#');
        boolean boolean53 = realMatrixImpl45.equals((java.lang.Object) realMatrixImpl50);
        double[] doubleArray55 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray57 = realMatrixImpl50.operate(doubleArray55);
        double[] doubleArray58 = realMatrixImpl7.preMultiply(doubleArray55);
        java.lang.String str59 = realMatrixImpl7.toString();
        double double60 = realMatrixImpl7.getTrace();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str59, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1568, (-807200536));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        realMatrixImpl13.luDecompose();
        boolean boolean26 = realMatrixImpl13.isSquare();
        double double27 = realMatrixImpl13.getTrace();
        int int28 = realMatrixImpl13.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.scalarAdd((double) '#');
        double[] doubleArray49 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl50.scalarAdd((double) '#');
        boolean boolean53 = realMatrixImpl45.equals((java.lang.Object) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.scalarAdd((double) 10);
        int int56 = realMatrixImpl50.getRowDimension();
        int int57 = realMatrixImpl50.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl50.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl7.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        int[] intArray62 = new int[] { 1072693248, (-1072693248) };
        int[] intArray66 = new int[] { 3, 52, 1079574528 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl7.getSubMatrix(intArray62, intArray66);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[1072693248, -1072693248]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[3, 52, 1079574528]");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double double11 = realMatrixImpl2.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl2.transpose();
        int[] intArray19 = new int[] { (-1069547520), (short) 100, 4, (-807200535), (-1072693248), (-1) };
        int[] intArray20 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl2.getSubMatrix(intArray19, intArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: selected row and column index arrays must be non-empty");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1069547520, 100, 4, -807200535, -1072693248, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1079574528, 277, (-129));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (short) -1, (-807200536));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1072693248, (-1011886072));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(4.9E-324d, (double) (-1072693248));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0726932490021657E9d) + "'", double2 == (-1.0726932490021657E9d));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl7.inverse();
        double double15 = realMatrixImpl7.getDeterminant();
        realMatrixImpl7.luDecompose();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray15 = realMatrixImpl7.getData();
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        double[] doubleArray22 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray24 = realMatrixImpl18.operate(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.copy();
        boolean boolean28 = realMatrixImpl25.isSquare();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray15 = realMatrixImpl7.getData();
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        double[] doubleArray22 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl23.scalarAdd((double) '#');
        boolean boolean26 = realMatrixImpl18.equals((java.lang.Object) realMatrixImpl23);
        double[] doubleArray28 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl29.scalarAdd((double) '#');
        double[] doubleArray33 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.scalarAdd((double) '#');
        boolean boolean37 = realMatrixImpl29.equals((java.lang.Object) realMatrixImpl34);
        int int38 = realMatrixImpl29.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl18.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl29.transpose();
        realMatrixImpl29.luDecompose();
        double[] doubleArray43 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarAdd((double) '#');
        double[] doubleArray48 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl49.scalarAdd((double) '#');
        boolean boolean52 = realMatrixImpl44.equals((java.lang.Object) realMatrixImpl49);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl49.scalarAdd((double) 10);
        int int55 = realMatrixImpl49.getRowDimension();
        int int56 = realMatrixImpl49.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl49.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl29.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray60 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl61.scalarAdd((double) '#');
        double[] doubleArray65 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray67 = realMatrixImpl61.operate(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl29.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        boolean boolean69 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl61);
        double double70 = realMatrixImpl61.getTrace();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl61.copy();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix71);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1078591488, (-1597020));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        int int1 = org.apache.commons.math.util.MathUtils.hash(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1847674149 + "'", int1 == 1847674149);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        boolean boolean24 = realMatrixImpl13.isSingular();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl7.inverse();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl7.transpose();
        boolean boolean16 = realMatrixImpl7.isSingular();
        double[][] doubleArray17 = realMatrixImpl7.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1078591388L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl7.inverse();
        double[] doubleArray16 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl17.scalarAdd((double) '#');
        double[] doubleArray21 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) '#');
        boolean boolean25 = realMatrixImpl17.equals((java.lang.Object) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray28 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl29.scalarAdd((double) '#');
        double[] doubleArray33 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.scalarAdd((double) '#');
        boolean boolean37 = realMatrixImpl29.equals((java.lang.Object) realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.scalarAdd((double) 10);
        double[] doubleArray41 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl42.scalarAdd((double) '#');
        double[] doubleArray46 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl47.scalarAdd((double) '#');
        boolean boolean50 = realMatrixImpl42.equals((java.lang.Object) realMatrixImpl47);
        double[] doubleArray52 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl53.scalarAdd((double) '#');
        double[] doubleArray57 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl58.scalarAdd((double) '#');
        boolean boolean61 = realMatrixImpl53.equals((java.lang.Object) realMatrixImpl58);
        int int62 = realMatrixImpl53.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl42.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl53.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl34.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl22.solve(realMatrix65);
        // The following exception was thrown during execution in test generation
        try {
            double double69 = realMatrixImpl22.getEntry((int) (byte) 100, 46883);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(2.1706325668632683E10d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        realMatrixImpl13.luDecompose();
        double[] doubleArray27 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.scalarAdd((double) '#');
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        boolean boolean36 = realMatrixImpl28.equals((java.lang.Object) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.scalarAdd((double) 10);
        int int39 = realMatrixImpl33.getRowDimension();
        int int40 = realMatrixImpl33.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl33.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        int[] intArray46 = new int[] { (-129), (-1291), (-534803777) };
        int[] intArray53 = new int[] { 1095479169, (byte) 10, (-1322), (-1072693238), 1095479169, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl33.getSubMatrix(intArray46, intArray53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-129, -1291, -534803777]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1095479169, 10, -1322, -1072693238, 1095479169, 10]");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1362265433);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1238));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) '#', 1289);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray15 = realMatrixImpl7.getData();
        double double16 = realMatrixImpl7.getDeterminant();
        double[] doubleArray18 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.scalarAdd((double) '#');
        double[] doubleArray23 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl24.scalarAdd((double) '#');
        boolean boolean27 = realMatrixImpl19.equals((java.lang.Object) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.scalarAdd((double) 10);
        double[][] doubleArray30 = realMatrixImpl24.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl7.setSubMatrix(doubleArray30, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray30);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        int int39 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray41 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl42.scalarAdd((double) '#');
        double[] doubleArray46 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray48 = realMatrixImpl42.operate(doubleArray46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray51 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl52.scalarAdd((double) '#');
        double[] doubleArray56 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl57.scalarAdd((double) '#');
        boolean boolean60 = realMatrixImpl52.equals((java.lang.Object) realMatrixImpl57);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.scalarAdd((double) 10);
        int int63 = realMatrixImpl57.getRowDimension();
        double[] doubleArray65 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl66.scalarAdd((double) '#');
        double[] doubleArray70 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        double[] doubleArray72 = realMatrixImpl66.operate(doubleArray70);
        double[] doubleArray73 = realMatrixImpl57.operate(doubleArray72);
        double[] doubleArray74 = realMatrixImpl49.operate(doubleArray72);
        double[] doubleArray75 = realMatrixImpl7.operate(doubleArray72);
        double double76 = realMatrixImpl7.getTrace();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl7.scalarAdd((double) 35);
        int int79 = realMatrixImpl7.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        realMatrixImpl13.luDecompose();
        double[] doubleArray27 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.scalarAdd((double) '#');
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        boolean boolean36 = realMatrixImpl28.equals((java.lang.Object) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.scalarAdd((double) 10);
        int int39 = realMatrixImpl33.getRowDimension();
        int int40 = realMatrixImpl33.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl33.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double double43 = realMatrixImpl33.getNorm();
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        int int47 = org.apache.commons.math.util.MathUtils.hash(doubleArray45);
        double[] doubleArray48 = realMatrixImpl33.operate(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl33.scalarAdd((double) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl33.scalarAdd(0.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1074790369) + "'", int47 == (-1074790369));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix52);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        double[] doubleArray26 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarAdd((double) '#');
        double[] doubleArray31 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl32.scalarAdd((double) '#');
        boolean boolean35 = realMatrixImpl27.equals((java.lang.Object) realMatrixImpl32);
        double[] doubleArray37 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.scalarAdd((double) '#');
        double[] doubleArray42 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl43.scalarAdd((double) '#');
        boolean boolean46 = realMatrixImpl38.equals((java.lang.Object) realMatrixImpl43);
        int int47 = realMatrixImpl38.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl27.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl38.transpose();
        boolean boolean50 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl38);
        double[] doubleArray52 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl53.scalarAdd((double) '#');
        double[] doubleArray57 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl58.scalarAdd((double) '#');
        boolean boolean61 = realMatrixImpl53.equals((java.lang.Object) realMatrixImpl58);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl58.scalarAdd((double) 10);
        int int64 = realMatrixImpl58.getRowDimension();
        int int65 = realMatrixImpl58.getColumnDimension();
        double[][] doubleArray66 = realMatrixImpl58.getData();
        double[] doubleArray68 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl69.scalarAdd((double) '#');
        double[] doubleArray73 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double[] doubleArray75 = realMatrixImpl69.operate(doubleArray73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl58.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl76);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl58.scalarMultiply((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl38.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        int int81 = realMatrixImpl58.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        boolean boolean3 = realMatrixImpl2.isSquare();
        realMatrixImpl2.luDecompose();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl2.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean12 = realMatrixImpl2.equals((java.lang.Object) 0.0d);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.scalarAdd((double) 10);
        int int37 = realMatrixImpl31.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl31.inverse();
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarAdd((double) '#');
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.scalarAdd((double) '#');
        boolean boolean49 = realMatrixImpl41.equals((java.lang.Object) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl31.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        int int51 = realMatrixImpl46.getColumnDimension();
        double[] doubleArray53 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl54.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl46.add(realMatrix56);
        double[] doubleArray59 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl60.scalarAdd((double) '#');
        double[] doubleArray64 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl65.scalarAdd((double) '#');
        boolean boolean68 = realMatrixImpl60.equals((java.lang.Object) realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl65.scalarAdd((double) 10);
        int int71 = realMatrixImpl65.getRowDimension();
        double[] doubleArray73 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl74.scalarAdd((double) '#');
        double[] doubleArray78 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        double[] doubleArray80 = realMatrixImpl74.operate(doubleArray78);
        double[] doubleArray81 = realMatrixImpl65.operate(doubleArray80);
        double[] doubleArray82 = realMatrix57.solve(doubleArray80);
        double[] doubleArray83 = realMatrixImpl20.preMultiply(doubleArray82);
        double[] doubleArray84 = realMatrixImpl2.operate(doubleArray83);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.030303030303030304]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-0.030303030303030304]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.030303030303030304]");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1069547520));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) (-49), 51, 2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-49.0d) + "'", double3 == (-49.0d));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[][] doubleArray5 = realMatrixImpl2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.transpose();
        boolean boolean7 = realMatrixImpl2.isSquare();
        int int8 = realMatrixImpl2.getRowDimension();
        double[] doubleArray10 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl11.scalarAdd((double) '#');
        double[] doubleArray15 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.scalarAdd((double) '#');
        boolean boolean19 = realMatrixImpl11.equals((java.lang.Object) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl16.scalarAdd((double) 10);
        int int22 = realMatrixImpl16.getRowDimension();
        int int23 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray24 = realMatrixImpl16.getData();
        double[] doubleArray26 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarAdd((double) '#');
        double[] doubleArray31 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray33 = realMatrixImpl27.operate(doubleArray31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double double36 = realMatrixImpl34.getNorm();
        double[] doubleArray38 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl39.scalarAdd((double) '#');
        double[] doubleArray43 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarAdd((double) '#');
        boolean boolean47 = realMatrixImpl39.equals((java.lang.Object) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.scalarAdd((double) 10);
        int int50 = realMatrixImpl44.getRowDimension();
        double[] doubleArray52 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl53.scalarAdd((double) '#');
        double[] doubleArray57 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        double[] doubleArray59 = realMatrixImpl53.operate(doubleArray57);
        double[] doubleArray60 = realMatrixImpl44.operate(doubleArray59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray62 = realMatrixImpl34.solve(doubleArray59);
        double[] doubleArray63 = realMatrixImpl2.preMultiply(doubleArray59);
        int int64 = realMatrixImpl2.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        long long1 = org.apache.commons.math.util.MathUtils.sign(3094L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl2.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray11 = realMatrixImpl7.getData();
        double[] doubleArray13 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl14.scalarAdd((double) '#');
        double[] doubleArray18 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.scalarAdd((double) '#');
        boolean boolean22 = realMatrixImpl14.equals((java.lang.Object) realMatrixImpl19);
        double[] doubleArray24 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.scalarAdd((double) '#');
        double[] doubleArray29 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl30.scalarAdd((double) '#');
        boolean boolean33 = realMatrixImpl25.equals((java.lang.Object) realMatrixImpl30);
        int int34 = realMatrixImpl25.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl14.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl25.transpose();
        realMatrixImpl25.luDecompose();
        double[] doubleArray39 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl40.scalarAdd((double) '#');
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.scalarAdd((double) '#');
        boolean boolean48 = realMatrixImpl40.equals((java.lang.Object) realMatrixImpl45);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.scalarAdd((double) 10);
        int int51 = realMatrixImpl45.getRowDimension();
        int int52 = realMatrixImpl45.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl45.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl25.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double double55 = realMatrixImpl45.getNorm();
        double[] doubleArray57 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        int int59 = org.apache.commons.math.util.MathUtils.hash(doubleArray57);
        double[] doubleArray60 = realMatrixImpl45.operate(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl45.scalarAdd((double) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        int[] intArray65 = new int[] { (-1072693248) };
        int[] intArray72 = new int[] { 1072693248, (byte) 100, 1072693248, (byte) 100, (-1072693238), (-1072692971) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl45.getSubMatrix(intArray65, intArray72);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1074790369) + "'", int59 == (-1074790369));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1072693248]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1072693248, 100, 1072693248, 100, -1072693238, -1072692971]");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        double[] doubleArray15 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.scalarAdd((double) '#');
        double[] doubleArray20 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl21.scalarAdd((double) '#');
        boolean boolean24 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl21);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.scalarAdd((double) 10);
        int int27 = realMatrixImpl21.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl21.inverse();
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        double[] doubleArray35 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.scalarAdd((double) '#');
        boolean boolean39 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl21.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        int int41 = realMatrixImpl36.getColumnDimension();
        double[] doubleArray43 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl36.add(realMatrix46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray50 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl51.scalarAdd((double) '#');
        double[] doubleArray55 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray57 = realMatrixImpl51.operate(doubleArray55);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl58.scalarAdd(0.07525749891599529d);
        int int62 = realMatrixImpl58.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        double double4 = realMatrixImpl3.getDeterminant();
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        double[] doubleArray11 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl12.scalarAdd((double) '#');
        boolean boolean15 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.scalarAdd((double) 10);
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        double[] doubleArray24 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.scalarAdd((double) '#');
        boolean boolean28 = realMatrixImpl20.equals((java.lang.Object) realMatrixImpl25);
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        double[] doubleArray35 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.scalarAdd((double) '#');
        boolean boolean39 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl36);
        int int40 = realMatrixImpl31.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl20.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl12.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl3.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[][] doubleArray45 = realMatrixImpl31.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.transpose();
        double[] doubleArray48 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl49.scalarAdd((double) '#');
        double[] doubleArray53 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl54.scalarAdd((double) '#');
        boolean boolean57 = realMatrixImpl49.equals((java.lang.Object) realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl49.scalarMultiply(100.0d);
        double[] doubleArray61 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl62.scalarAdd((double) '#');
        double[] doubleArray66 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl67.scalarAdd((double) '#');
        boolean boolean70 = realMatrixImpl62.equals((java.lang.Object) realMatrixImpl67);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl62.scalarMultiply(100.0d);
        double[] doubleArray74 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl62.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrix59.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        boolean boolean78 = realMatrixImpl75.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl31.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        double double80 = realMatrixImpl31.getNorm();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.scalarAdd((double) 10);
        int int24 = realMatrixImpl18.getRowDimension();
        double[] doubleArray26 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarAdd((double) '#');
        double[] doubleArray31 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray33 = realMatrixImpl27.operate(doubleArray31);
        double[] doubleArray34 = realMatrixImpl18.operate(doubleArray33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl35.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl7.solve(realMatrix36);
        double[][] doubleArray38 = realMatrixImpl7.getDataRef();
        boolean boolean39 = realMatrixImpl7.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = realMatrixImpl7.getColumn(277);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl2.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double double11 = realMatrixImpl7.getTrace();
        double[] doubleArray13 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl14.scalarAdd((double) '#');
        double[] doubleArray18 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.scalarAdd((double) '#');
        boolean boolean22 = realMatrixImpl14.equals((java.lang.Object) realMatrixImpl19);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.scalarAdd((double) 10);
        int int25 = realMatrixImpl19.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl19.inverse();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl19.transpose();
        java.lang.String str28 = realMatrixImpl19.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl7.transpose();
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        double[] doubleArray37 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.scalarAdd((double) '#');
        boolean boolean41 = realMatrixImpl33.equals((java.lang.Object) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl33.scalarMultiply(100.0d);
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.scalarAdd((double) '#');
        double[] doubleArray50 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl51.scalarAdd((double) '#');
        boolean boolean54 = realMatrixImpl46.equals((java.lang.Object) realMatrixImpl51);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl46.scalarMultiply(100.0d);
        double[] doubleArray58 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl46.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrix43.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        boolean boolean62 = realMatrixImpl59.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        double[][] doubleArray64 = realMatrixImpl59.getData();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str28, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray64);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        int int39 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl7.scalarAdd((double) 35);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl7.scalarMultiply((-100.0d));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        boolean boolean24 = realMatrixImpl13.isSquare();
        double[] doubleArray26 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarAdd((double) '#');
        double[] doubleArray31 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl32.scalarAdd((double) '#');
        boolean boolean35 = realMatrixImpl27.equals((java.lang.Object) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.scalarAdd((double) 10);
        int int38 = realMatrixImpl32.getRowDimension();
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarAdd((double) '#');
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray47 = realMatrixImpl41.operate(doubleArray45);
        double[] doubleArray48 = realMatrixImpl32.operate(doubleArray47);
        double[] doubleArray49 = realMatrixImpl13.solve(doubleArray47);
        double[][] doubleArray50 = realMatrixImpl13.getData();
        int int51 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl13.scalarMultiply((-49.0d));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(realMatrix53);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        boolean boolean24 = realMatrixImpl13.isSquare();
        double[] doubleArray26 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarAdd((double) '#');
        double[] doubleArray31 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl32.scalarAdd((double) '#');
        boolean boolean35 = realMatrixImpl27.equals((java.lang.Object) realMatrixImpl32);
        double[] doubleArray37 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.scalarAdd((double) '#');
        double[] doubleArray42 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl43.scalarAdd((double) '#');
        boolean boolean46 = realMatrixImpl38.equals((java.lang.Object) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.scalarAdd((double) 10);
        double[] doubleArray50 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl51.scalarAdd((double) '#');
        double[] doubleArray55 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl56.scalarAdd((double) '#');
        boolean boolean59 = realMatrixImpl51.equals((java.lang.Object) realMatrixImpl56);
        double[] doubleArray61 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl62.scalarAdd((double) '#');
        double[] doubleArray66 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl67.scalarAdd((double) '#');
        boolean boolean70 = realMatrixImpl62.equals((java.lang.Object) realMatrixImpl67);
        int int71 = realMatrixImpl62.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl51.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl62);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl62.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl43.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl62);
        double[] doubleArray76 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl43.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl77);
        double[] doubleArray80 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl81.scalarAdd((double) '#');
        double[] doubleArray85 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl86 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl86.scalarAdd((double) '#');
        boolean boolean89 = realMatrixImpl81.equals((java.lang.Object) realMatrixImpl86);
        double[] doubleArray91 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray91);
        double[] doubleArray93 = realMatrixImpl86.operate(doubleArray91);
        double[] doubleArray94 = realMatrixImpl43.preMultiply(doubleArray91);
        double[] doubleArray95 = realMatrixImpl32.operate(doubleArray91);
        double[] doubleArray96 = realMatrixImpl13.solve(doubleArray95);
        int int97 = org.apache.commons.math.util.MathUtils.hash(doubleArray96);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1074790369) + "'", int97 == (-1074790369));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl2.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl13.inverse();
        double[] doubleArray16 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray18 = realMatrixImpl13.operate(doubleArray16);
        double[] doubleArray19 = realMatrixImpl2.solve(doubleArray18);
        double[] doubleArray21 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) '#');
        double[] doubleArray26 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarAdd((double) '#');
        boolean boolean30 = realMatrixImpl22.equals((java.lang.Object) realMatrixImpl27);
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        double[] doubleArray37 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.scalarAdd((double) '#');
        boolean boolean41 = realMatrixImpl33.equals((java.lang.Object) realMatrixImpl38);
        int int42 = realMatrixImpl33.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl22.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean44 = realMatrixImpl33.isSquare();
        double[] doubleArray46 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl47.scalarAdd((double) '#');
        double[] doubleArray51 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl52.scalarAdd((double) '#');
        boolean boolean55 = realMatrixImpl47.equals((java.lang.Object) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl52.scalarAdd((double) 10);
        int int58 = realMatrixImpl52.getRowDimension();
        double[] doubleArray60 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl61.scalarAdd((double) '#');
        double[] doubleArray65 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray67 = realMatrixImpl61.operate(doubleArray65);
        double[] doubleArray68 = realMatrixImpl52.operate(doubleArray67);
        double[] doubleArray69 = realMatrixImpl33.solve(doubleArray67);
        double[][] doubleArray70 = realMatrixImpl33.getData();
        double[] doubleArray72 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl73.scalarAdd((double) '#');
        double[] doubleArray77 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl78.scalarAdd((double) '#');
        boolean boolean81 = realMatrixImpl73.equals((java.lang.Object) realMatrixImpl78);
        double[] doubleArray83 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray83);
        double[] doubleArray85 = realMatrixImpl78.operate(doubleArray83);
        double[] doubleArray86 = realMatrixImpl33.preMultiply(doubleArray85);
        double[] doubleArray87 = realMatrixImpl2.preMultiply(doubleArray86);
        double[] doubleArray89 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray89);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl91 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray89);
        double double92 = realMatrixImpl91.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl91);
        java.lang.String str94 = realMatrixImpl2.toString();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str94, "RealMatrixImpl{{-1.0}}");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl7.inverse();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        boolean boolean24 = realMatrixImpl2.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl2.inverse();
        double[] doubleArray27 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.scalarAdd((double) '#');
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        boolean boolean36 = realMatrixImpl28.equals((java.lang.Object) realMatrixImpl33);
        double[] doubleArray38 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl39.scalarAdd((double) '#');
        double[] doubleArray43 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarAdd((double) '#');
        boolean boolean47 = realMatrixImpl39.equals((java.lang.Object) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.scalarAdd((double) 10);
        int int50 = realMatrixImpl44.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl44.inverse();
        double[] doubleArray53 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl54.scalarAdd((double) '#');
        double[] doubleArray58 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.scalarAdd((double) '#');
        boolean boolean62 = realMatrixImpl54.equals((java.lang.Object) realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl44.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        int int64 = realMatrixImpl59.getColumnDimension();
        double[] doubleArray66 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl67.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl59.add(realMatrix69);
        double[] doubleArray72 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl73.scalarAdd((double) '#');
        double[] doubleArray77 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl78.scalarAdd((double) '#');
        boolean boolean81 = realMatrixImpl73.equals((java.lang.Object) realMatrixImpl78);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl78.scalarAdd((double) 10);
        int int84 = realMatrixImpl78.getRowDimension();
        double[] doubleArray86 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl87.scalarAdd((double) '#');
        double[] doubleArray91 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray91);
        double[] doubleArray93 = realMatrixImpl87.operate(doubleArray91);
        double[] doubleArray94 = realMatrixImpl78.operate(doubleArray93);
        double[] doubleArray95 = realMatrix70.solve(doubleArray93);
        double[] doubleArray96 = realMatrixImpl33.preMultiply(doubleArray95);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl97 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray95);
        double[] doubleArray98 = realMatrixImpl2.operate(doubleArray95);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[0.030303030303030304]");
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[-0.030303030303030304]");
        org.junit.Assert.assertNotNull(doubleArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray98), "[-0.030303030303030304]");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 1362265433);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1069547520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int int1 = org.apache.commons.math.util.MathUtils.hash(6.594202913790459d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-90322048) + "'", int1 == (-90322048));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(277);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1284.5840973424201d + "'", double1 == 1284.5840973424201d);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(1341, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69732 + "'", int2 == 69732);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-1597020L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1087274576, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 584.2603842210649d + "'", double2 == 584.2603842210649d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl7.inverse();
        double[] doubleArray16 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl17.scalarAdd((double) '#');
        double[] doubleArray21 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) '#');
        boolean boolean25 = realMatrixImpl17.equals((java.lang.Object) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        int int27 = realMatrixImpl22.getColumnDimension();
        int[] intArray34 = new int[] { 69732, 129, 965739519, 1079574528, (-49), (-1238) };
        int[] intArray39 = new int[] { (-1072692971), 10, (-1597020), (-1597020) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl22.getSubMatrix(intArray34, intArray39);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[69732, 129, 965739519, 1079574528, -49, -1238]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1072692971, 10, -1597020, -1597020]");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        boolean boolean24 = realMatrixImpl13.isSquare();
        double[] doubleArray26 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarAdd((double) '#');
        double[] doubleArray31 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl32.scalarAdd((double) '#');
        boolean boolean35 = realMatrixImpl27.equals((java.lang.Object) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.scalarAdd((double) 10);
        int int38 = realMatrixImpl32.getRowDimension();
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarAdd((double) '#');
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray47 = realMatrixImpl41.operate(doubleArray45);
        double[] doubleArray48 = realMatrixImpl32.operate(doubleArray47);
        double[] doubleArray49 = realMatrixImpl13.solve(doubleArray47);
        double[][] doubleArray50 = realMatrixImpl13.getData();
        double double51 = realMatrixImpl13.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl13.scalarMultiply((double) 1072693248);
        java.lang.String str54 = realMatrixImpl13.toString();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str54, "RealMatrixImpl{{-1.0}}");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-1011886072), (double) 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0118860719999999E9d) + "'", double2 == (-1.0118860719999999E9d));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round(10010.000000000002d, (-1069547520));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray15 = realMatrixImpl7.getData();
        double double16 = realMatrixImpl7.getDeterminant();
        double[] doubleArray18 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.scalarAdd((double) '#');
        double[] doubleArray23 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl24.scalarAdd((double) '#');
        boolean boolean27 = realMatrixImpl19.equals((java.lang.Object) realMatrixImpl24);
        double[] doubleArray29 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl30.scalarAdd((double) '#');
        double[] doubleArray34 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl35.scalarAdd((double) '#');
        boolean boolean38 = realMatrixImpl30.equals((java.lang.Object) realMatrixImpl35);
        int int39 = realMatrixImpl30.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl19.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl30.transpose();
        realMatrixImpl30.luDecompose();
        boolean boolean43 = realMatrixImpl30.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl7.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(realMatrix44);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-10L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.scalarAdd((double) 10);
        double[] doubleArray38 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl39.scalarAdd((double) '#');
        double[] doubleArray43 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarAdd((double) '#');
        boolean boolean47 = realMatrixImpl39.equals((java.lang.Object) realMatrixImpl44);
        double[] doubleArray49 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl50.scalarAdd((double) '#');
        double[] doubleArray54 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl55.scalarAdd((double) '#');
        boolean boolean58 = realMatrixImpl50.equals((java.lang.Object) realMatrixImpl55);
        int int59 = realMatrixImpl50.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl39.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl50.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl31.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[][] doubleArray63 = realMatrixImpl31.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrix23.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(realMatrix64);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        double[] doubleArray15 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.scalarAdd((double) '#');
        double[] doubleArray20 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray22 = realMatrixImpl16.operate(doubleArray20);
        double[] doubleArray23 = realMatrixImpl7.operate(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        int int26 = realMatrixImpl25.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        double[] doubleArray15 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.scalarAdd((double) '#');
        double[] doubleArray20 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray22 = realMatrixImpl16.operate(doubleArray20);
        double[] doubleArray23 = realMatrixImpl7.operate(doubleArray22);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.scalarAdd((double) 10);
        int int37 = realMatrixImpl31.getRowDimension();
        double[] doubleArray39 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl40.scalarAdd((double) '#');
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray46 = realMatrixImpl40.operate(doubleArray44);
        double[] doubleArray47 = realMatrixImpl31.operate(doubleArray46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray49 = realMatrixImpl7.preMultiply(doubleArray46);
        double[] doubleArray51 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl52.scalarAdd((double) '#');
        double[] doubleArray56 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl57.scalarAdd((double) '#');
        boolean boolean60 = realMatrixImpl52.equals((java.lang.Object) realMatrixImpl57);
        double[] doubleArray62 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl63.scalarAdd((double) '#');
        double[] doubleArray67 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl68.scalarAdd((double) '#');
        boolean boolean71 = realMatrixImpl63.equals((java.lang.Object) realMatrixImpl68);
        int int72 = realMatrixImpl63.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl52.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl63.transpose();
        realMatrixImpl63.luDecompose();
        boolean boolean76 = realMatrixImpl63.isSquare();
        double double77 = realMatrixImpl63.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix78);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.scalarAdd((double) 10);
        int int26 = realMatrixImpl20.getRowDimension();
        double[] doubleArray28 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl29.scalarAdd((double) '#');
        double[] doubleArray33 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray35 = realMatrixImpl29.operate(doubleArray33);
        double[] doubleArray36 = realMatrixImpl20.operate(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarAdd((double) '#');
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.scalarAdd((double) '#');
        boolean boolean49 = realMatrixImpl41.equals((java.lang.Object) realMatrixImpl46);
        double[] doubleArray51 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl52.scalarAdd((double) '#');
        double[] doubleArray56 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl57.scalarAdd((double) '#');
        boolean boolean60 = realMatrixImpl52.equals((java.lang.Object) realMatrixImpl57);
        int int61 = realMatrixImpl52.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl41.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean63 = realMatrixImpl52.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl52.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl52.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl7.preMultiply(realMatrix65);
        // The following exception was thrown during execution in test generation
        try {
            double double69 = realMatrix66.getEntry((-1074790369), 1362265401);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl3.transpose();
        double[][] doubleArray5 = realMatrixImpl3.getData();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) (-1011886072));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        int int39 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl7.scalarAdd((double) 35);
        double double42 = realMatrixImpl7.getTrace();
        double double43 = realMatrixImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl7.transpose();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix44);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        double[] doubleArray15 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.scalarAdd((double) '#');
        double[] doubleArray20 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray22 = realMatrixImpl16.operate(doubleArray20);
        double[] doubleArray23 = realMatrixImpl7.operate(doubleArray22);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.scalarAdd((double) 10);
        int int37 = realMatrixImpl31.getRowDimension();
        double[] doubleArray39 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl40.scalarAdd((double) '#');
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray46 = realMatrixImpl40.operate(doubleArray44);
        double[] doubleArray47 = realMatrixImpl31.operate(doubleArray46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray49 = realMatrixImpl7.preMultiply(doubleArray46);
        boolean boolean50 = realMatrixImpl7.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl7.getSubMatrix((-1597020), (-1072693248), 16, 1341);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4463520074491623d + "'", double1 == 2.4463520074491623d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl2.scalarMultiply(100.0d);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean37 = realMatrixImpl26.isSquare();
        double[] doubleArray39 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl40.scalarAdd((double) '#');
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.scalarAdd((double) '#');
        boolean boolean48 = realMatrixImpl40.equals((java.lang.Object) realMatrixImpl45);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.scalarAdd((double) 10);
        int int51 = realMatrixImpl45.getRowDimension();
        double[] doubleArray53 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl54.scalarAdd((double) '#');
        double[] doubleArray58 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray60 = realMatrixImpl54.operate(doubleArray58);
        double[] doubleArray61 = realMatrixImpl45.operate(doubleArray60);
        double[] doubleArray62 = realMatrixImpl26.solve(doubleArray60);
        double[][] doubleArray63 = realMatrixImpl26.getData();
        double double64 = realMatrixImpl26.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl2.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[][] doubleArray66 = realMatrixImpl2.getData();
        double double67 = realMatrixImpl2.getDeterminant();
        int int68 = realMatrixImpl2.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        realMatrixImpl13.luDecompose();
        double[] doubleArray27 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.scalarAdd((double) '#');
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        boolean boolean36 = realMatrixImpl28.equals((java.lang.Object) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.scalarAdd((double) 10);
        int int39 = realMatrixImpl33.getRowDimension();
        int int40 = realMatrixImpl33.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl33.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double double43 = realMatrixImpl33.getNorm();
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        int int47 = org.apache.commons.math.util.MathUtils.hash(doubleArray45);
        double[] doubleArray48 = realMatrixImpl33.operate(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl33.scalarAdd((double) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl33.inverse();
        realMatrixImpl33.luDecompose();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl33.getSubMatrix(46883, (-807200536), (int) (byte) 1, 4001056);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1074790369) + "'", int47 == (-1074790369));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix51);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((-1072693238), 965739519);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = realMatrixImpl7.getRow((-129));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(1.0000000000000002d, (-129), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double double43 = realMatrixImpl41.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl41.inverse();
        // The following exception was thrown during execution in test generation
        try {
            double double47 = realMatrixImpl41.getEntry(0, (-1011886072));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix44);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        double[] doubleArray4 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl5.scalarAdd((double) '#');
        double[] doubleArray9 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.scalarAdd((double) '#');
        boolean boolean13 = realMatrixImpl5.equals((java.lang.Object) realMatrixImpl10);
        double[] doubleArray15 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.scalarAdd((double) '#');
        double[] doubleArray20 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl21.scalarAdd((double) '#');
        boolean boolean24 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl21);
        int int25 = realMatrixImpl16.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl5.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl16.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl2.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        double[] doubleArray35 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.scalarAdd((double) '#');
        boolean boolean39 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.scalarAdd((double) 10);
        double[] doubleArray43 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarAdd((double) '#');
        double[] doubleArray48 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl49.scalarAdd((double) '#');
        boolean boolean52 = realMatrixImpl44.equals((java.lang.Object) realMatrixImpl49);
        double[] doubleArray54 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl55.scalarAdd((double) '#');
        double[] doubleArray59 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl60.scalarAdd((double) '#');
        boolean boolean63 = realMatrixImpl55.equals((java.lang.Object) realMatrixImpl60);
        int int64 = realMatrixImpl55.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl44.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl55.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl36.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        int int68 = realMatrixImpl36.getColumnDimension();
        double[] doubleArray70 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl71.scalarAdd((double) '#');
        double[] doubleArray75 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl76.scalarAdd((double) '#');
        boolean boolean79 = realMatrixImpl71.equals((java.lang.Object) realMatrixImpl76);
        double[] doubleArray81 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl82.scalarAdd((double) '#');
        double[] doubleArray86 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl87.scalarAdd((double) '#');
        boolean boolean90 = realMatrixImpl82.equals((java.lang.Object) realMatrixImpl87);
        int int91 = realMatrixImpl82.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix92 = realMatrixImpl71.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl82);
        boolean boolean93 = realMatrixImpl71.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix94 = realMatrixImpl36.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl71);
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrix94.scalarAdd((double) 1078591488);
        org.apache.commons.math.linear.RealMatrix realMatrix97 = realMatrixImpl16.preMultiply(realMatrix94);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(realMatrix92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(realMatrix94);
        org.junit.Assert.assertNotNull(realMatrix96);
        org.junit.Assert.assertNotNull(realMatrix97);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException1 = new org.apache.commons.math.linear.MatrixIndexException("");
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException3 = new org.apache.commons.math.linear.MatrixIndexException("");
        matrixIndexException1.addSuppressed((java.lang.Throwable) matrixIndexException3);
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException5 = new org.apache.commons.math.linear.MatrixIndexException();
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException7 = new org.apache.commons.math.linear.MatrixIndexException("org.apache.commons.math.linear.InvalidMatrixException");
        matrixIndexException5.addSuppressed((java.lang.Throwable) matrixIndexException7);
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException10 = new org.apache.commons.math.linear.MatrixIndexException("");
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException12 = new org.apache.commons.math.linear.MatrixIndexException("");
        matrixIndexException10.addSuppressed((java.lang.Throwable) matrixIndexException12);
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException14 = new org.apache.commons.math.linear.InvalidMatrixException();
        matrixIndexException10.addSuppressed((java.lang.Throwable) invalidMatrixException14);
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException17 = new org.apache.commons.math.linear.InvalidMatrixException("hi!");
        matrixIndexException10.addSuppressed((java.lang.Throwable) invalidMatrixException17);
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException19 = new org.apache.commons.math.linear.MatrixIndexException();
        java.lang.Throwable[] throwableArray20 = matrixIndexException19.getSuppressed();
        matrixIndexException10.addSuppressed((java.lang.Throwable) matrixIndexException19);
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException23 = new org.apache.commons.math.linear.MatrixIndexException("");
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException25 = new org.apache.commons.math.linear.MatrixIndexException("");
        matrixIndexException23.addSuppressed((java.lang.Throwable) matrixIndexException25);
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException27 = new org.apache.commons.math.linear.InvalidMatrixException();
        matrixIndexException23.addSuppressed((java.lang.Throwable) invalidMatrixException27);
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException30 = new org.apache.commons.math.linear.InvalidMatrixException("hi!");
        matrixIndexException23.addSuppressed((java.lang.Throwable) invalidMatrixException30);
        matrixIndexException10.addSuppressed((java.lang.Throwable) matrixIndexException23);
        matrixIndexException5.addSuppressed((java.lang.Throwable) matrixIndexException10);
        matrixIndexException1.addSuppressed((java.lang.Throwable) matrixIndexException10);
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException36 = new org.apache.commons.math.linear.MatrixIndexException("");
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException38 = new org.apache.commons.math.linear.InvalidMatrixException("org.apache.commons.math.linear.InvalidMatrixException");
        matrixIndexException36.addSuppressed((java.lang.Throwable) invalidMatrixException38);
        matrixIndexException1.addSuppressed((java.lang.Throwable) matrixIndexException36);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 1847674149, (double) 33479479740585L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4595149951776754d + "'", double2 == 1.4595149951776754d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        realMatrixImpl13.luDecompose();
        boolean boolean26 = realMatrixImpl13.isSquare();
        double double27 = realMatrixImpl13.getDeterminant();
        int int28 = realMatrixImpl13.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[][] doubleArray5 = realMatrixImpl2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.transpose();
        boolean boolean7 = realMatrixImpl2.isSquare();
        int int8 = realMatrixImpl2.getRowDimension();
        boolean boolean9 = realMatrixImpl2.isSquare();
        double[] doubleArray11 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double double14 = realMatrixImpl13.getDeterminant();
        double[] doubleArray16 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl17.scalarAdd((double) '#');
        double[] doubleArray21 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) '#');
        boolean boolean25 = realMatrixImpl17.equals((java.lang.Object) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.scalarAdd((double) 10);
        double[] doubleArray29 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl30.scalarAdd((double) '#');
        double[] doubleArray34 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl35.scalarAdd((double) '#');
        boolean boolean38 = realMatrixImpl30.equals((java.lang.Object) realMatrixImpl35);
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarAdd((double) '#');
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.scalarAdd((double) '#');
        boolean boolean49 = realMatrixImpl41.equals((java.lang.Object) realMatrixImpl46);
        int int50 = realMatrixImpl41.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl30.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl41.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl22.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl13.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[][] doubleArray55 = realMatrixImpl41.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl41.transpose();
        boolean boolean57 = realMatrixImpl2.equals((java.lang.Object) realMatrix56);
        double[] doubleArray59 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl60.scalarAdd((double) '#');
        double[] doubleArray64 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double[] doubleArray66 = realMatrixImpl60.operate(doubleArray64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        double[] doubleArray69 = realMatrixImpl2.preMultiply(doubleArray66);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0]");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray15 = realMatrixImpl7.getData();
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        double[] doubleArray22 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl23.scalarAdd((double) '#');
        boolean boolean26 = realMatrixImpl18.equals((java.lang.Object) realMatrixImpl23);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl18.scalarMultiply(100.0d);
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray34 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl35.scalarAdd((double) '#');
        double[] doubleArray39 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl40.scalarAdd((double) '#');
        boolean boolean43 = realMatrixImpl35.equals((java.lang.Object) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.scalarAdd((double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl18.subtract(realMatrix45);
        boolean boolean47 = realMatrixImpl7.equals((java.lang.Object) realMatrix46);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl7.scalarMultiply(3.948148009134034E13d);
        int int50 = realMatrix49.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl7.inverse();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl7.transpose();
        boolean boolean16 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl7.transpose();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl7.inverse();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl7.transpose();
        boolean boolean16 = realMatrixImpl7.isSingular();
        double[][] doubleArray17 = realMatrixImpl7.getData();
        boolean boolean18 = realMatrixImpl7.isSquare();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl2.scalarMultiply(100.0d);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl2.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        int int17 = realMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        int int39 = realMatrixImpl7.getColumnDimension();
        java.lang.String str40 = realMatrixImpl7.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl7.inverse();
        double[] doubleArray43 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarAdd((double) '#');
        double[] doubleArray48 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray50 = realMatrixImpl44.operate(doubleArray48);
        double[] doubleArray51 = realMatrix41.operate(doubleArray48);
        int int52 = org.apache.commons.math.util.MathUtils.hash(doubleArray48);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str40, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1074790369) + "'", int52 == (-1074790369));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-1322), 3628800.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        int int1 = org.apache.commons.math.util.MathUtils.hash(81.55795945611504d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-608156879) + "'", int1 == (-608156879));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1289);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 3347947978752L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1291));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException1 = new org.apache.commons.math.linear.MatrixIndexException("org.apache.commons.math.linear.InvalidMatrixException");
        java.lang.Throwable[] throwableArray2 = matrixIndexException1.getSuppressed();
        java.lang.String str3 = matrixIndexException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.linear.MatrixIndexException: org.apache.commons.math.linear.InvalidMatrixException" + "'", str3, "org.apache.commons.math.linear.MatrixIndexException: org.apache.commons.math.linear.InvalidMatrixException");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray16 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl17.scalarAdd((double) '#');
        double[] doubleArray21 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) '#');
        boolean boolean25 = realMatrixImpl17.equals((java.lang.Object) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.scalarAdd((double) 10);
        double[] doubleArray29 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl30.scalarAdd((double) '#');
        double[] doubleArray34 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl35.scalarAdd((double) '#');
        boolean boolean38 = realMatrixImpl30.equals((java.lang.Object) realMatrixImpl35);
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarAdd((double) '#');
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.scalarAdd((double) '#');
        boolean boolean49 = realMatrixImpl41.equals((java.lang.Object) realMatrixImpl46);
        int int50 = realMatrixImpl41.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl30.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl41.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl22.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray55 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl22.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        double[] doubleArray59 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl60.scalarAdd((double) '#');
        double[] doubleArray64 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl65.scalarAdd((double) '#');
        boolean boolean68 = realMatrixImpl60.equals((java.lang.Object) realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl65.scalarAdd((double) 10);
        int int71 = realMatrixImpl65.getRowDimension();
        int int72 = realMatrixImpl65.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl65.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl22.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double double76 = realMatrixImpl22.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl22.transpose();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix77);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        int int39 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray41 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl42.scalarAdd((double) '#');
        double[] doubleArray46 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl47.scalarAdd((double) '#');
        boolean boolean50 = realMatrixImpl42.equals((java.lang.Object) realMatrixImpl47);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.scalarAdd((double) 10);
        double[] doubleArray54 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl55.scalarAdd((double) '#');
        double[] doubleArray59 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl60.scalarAdd((double) '#');
        boolean boolean63 = realMatrixImpl55.equals((java.lang.Object) realMatrixImpl60);
        double[] doubleArray65 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl66.scalarAdd((double) '#');
        double[] doubleArray70 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl71.scalarAdd((double) '#');
        boolean boolean74 = realMatrixImpl66.equals((java.lang.Object) realMatrixImpl71);
        int int75 = realMatrixImpl66.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl55.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl66.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl47.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl7.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl7.scalarMultiply(92.13617560368711d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix82);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix3 = realMatrixImpl2.inverse();
        double double4 = realMatrixImpl2.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1011886072));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.scalarAdd((double) 10);
        int int26 = realMatrixImpl20.getRowDimension();
        double[] doubleArray28 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl29.scalarAdd((double) '#');
        double[] doubleArray33 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray35 = realMatrixImpl29.operate(doubleArray33);
        double[] doubleArray36 = realMatrixImpl20.operate(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarAdd((double) '#');
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.scalarAdd((double) '#');
        boolean boolean49 = realMatrixImpl41.equals((java.lang.Object) realMatrixImpl46);
        double[] doubleArray51 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl52.scalarAdd((double) '#');
        double[] doubleArray56 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl57.scalarAdd((double) '#');
        boolean boolean60 = realMatrixImpl52.equals((java.lang.Object) realMatrixImpl57);
        int int61 = realMatrixImpl52.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl41.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean63 = realMatrixImpl52.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl52.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl52.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl7.preMultiply(realMatrix65);
        // The following exception was thrown during execution in test generation
        try {
            double double69 = realMatrixImpl7.getEntry((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray15 = realMatrixImpl7.getData();
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        double[] doubleArray22 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray24 = realMatrixImpl18.operate(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.copy();
        double[][] doubleArray28 = realMatrixImpl25.getData();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 33480558331973L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        boolean boolean24 = realMatrixImpl13.isSquare();
        int[] intArray27 = new int[] { 1072693279, (-49) };
        int[] intArray30 = new int[] { 1847674149, 1072693279 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl13.getSubMatrix(intArray27, intArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1072693279, -49]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1847674149, 1072693279]");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl7.inverse();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl7.transpose();
        java.lang.String str16 = realMatrixImpl7.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.scalarAdd((double) Float.NaN);
        double double19 = realMatrixImpl7.getTrace();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str16, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.scalarAdd((double) '#');
        double[] doubleArray49 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl50.scalarAdd((double) '#');
        boolean boolean53 = realMatrixImpl45.equals((java.lang.Object) realMatrixImpl50);
        double[] doubleArray55 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray57 = realMatrixImpl50.operate(doubleArray55);
        double[] doubleArray58 = realMatrixImpl7.preMultiply(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl7.scalarAdd((double) (-30.0f));
        double double61 = realMatrixImpl7.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl2.scalarMultiply(100.0d);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.scalarAdd((double) 10);
        double[] doubleArray27 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.scalarAdd((double) '#');
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        boolean boolean36 = realMatrixImpl28.equals((java.lang.Object) realMatrixImpl33);
        double[] doubleArray38 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl39.scalarAdd((double) '#');
        double[] doubleArray43 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarAdd((double) '#');
        boolean boolean47 = realMatrixImpl39.equals((java.lang.Object) realMatrixImpl44);
        int int48 = realMatrixImpl39.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl28.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl39.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl20.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray53 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl20.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl2.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray58 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.scalarAdd((double) '#');
        double[] doubleArray63 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl64.scalarAdd((double) '#');
        boolean boolean67 = realMatrixImpl59.equals((java.lang.Object) realMatrixImpl64);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl64.scalarAdd((double) 10);
        int int70 = realMatrixImpl64.getRowDimension();
        int int71 = realMatrixImpl64.getColumnDimension();
        double[][] doubleArray72 = realMatrixImpl64.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl20.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        double[][] doubleArray75 = realMatrixImpl20.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray75);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        realMatrixImpl13.luDecompose();
        double[] doubleArray27 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.scalarAdd((double) '#');
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        boolean boolean36 = realMatrixImpl28.equals((java.lang.Object) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.scalarAdd((double) 10);
        int int39 = realMatrixImpl33.getRowDimension();
        int int40 = realMatrixImpl33.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl33.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double double43 = realMatrixImpl33.getNorm();
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        int int47 = org.apache.commons.math.util.MathUtils.hash(doubleArray45);
        double[] doubleArray48 = realMatrixImpl33.operate(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl33.scalarAdd((double) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl33.copy();
        double[][] doubleArray52 = realMatrix51.getData();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1074790369) + "'", int47 == (-1074790369));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray52);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        double[] doubleArray15 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.scalarAdd((double) '#');
        double[] doubleArray20 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray22 = realMatrixImpl16.operate(doubleArray20);
        double[] doubleArray23 = realMatrixImpl7.operate(doubleArray22);
        double[][] doubleArray24 = realMatrixImpl7.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        realMatrixImpl13.luDecompose();
        double[] doubleArray27 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.scalarAdd((double) '#');
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        boolean boolean36 = realMatrixImpl28.equals((java.lang.Object) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.scalarAdd((double) 10);
        int int39 = realMatrixImpl33.getRowDimension();
        int int40 = realMatrixImpl33.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl33.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double double43 = realMatrixImpl33.getNorm();
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        int int47 = org.apache.commons.math.util.MathUtils.hash(doubleArray45);
        double[] doubleArray48 = realMatrixImpl33.operate(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl33.scalarAdd((double) 0);
        int int51 = realMatrixImpl33.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl33.getRowMatrix(0);
        boolean boolean54 = realMatrix53.isSquare();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1074790369) + "'", int47 == (-1074790369));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(8, 1847674149);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray15 = realMatrixImpl7.getData();
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        double[] doubleArray22 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray24 = realMatrixImpl18.operate(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl7.scalarMultiply((double) '4');
        java.lang.String str29 = realMatrixImpl7.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl7.inverse();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str29, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix30);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        long long1 = org.apache.commons.math.util.MathUtils.sign(3628800L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray15 = realMatrixImpl7.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray18 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.scalarAdd((double) '#');
        double[] doubleArray23 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl24.scalarAdd((double) '#');
        boolean boolean27 = realMatrixImpl19.equals((java.lang.Object) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.scalarAdd((double) 10);
        int int30 = realMatrixImpl24.getRowDimension();
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        double[] doubleArray37 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray39 = realMatrixImpl33.operate(doubleArray37);
        double[] doubleArray40 = realMatrixImpl24.operate(doubleArray39);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl41.copy();
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.scalarAdd((double) '#');
        double[] doubleArray49 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl50.scalarAdd((double) '#');
        boolean boolean53 = realMatrixImpl45.equals((java.lang.Object) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.scalarAdd((double) 10);
        int int56 = realMatrixImpl50.getRowDimension();
        double[] doubleArray58 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.scalarAdd((double) '#');
        double[] doubleArray63 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray65 = realMatrixImpl59.operate(doubleArray63);
        double[] doubleArray66 = realMatrixImpl50.operate(doubleArray65);
        double[] doubleArray67 = realMatrixImpl41.preMultiply(doubleArray66);
        double[] doubleArray69 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl70.scalarAdd((double) '#');
        double[] doubleArray74 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl75.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl70.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl16.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl16.inverse();
        double double82 = realMatrixImpl16.getDeterminant();
        double double83 = realMatrixImpl16.getTrace();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[][] doubleArray5 = realMatrixImpl2.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.transpose();
        boolean boolean7 = realMatrixImpl2.isSquare();
        int int8 = realMatrixImpl2.getRowDimension();
        boolean boolean9 = realMatrixImpl2.isSquare();
        double[] doubleArray11 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double double14 = realMatrixImpl13.getDeterminant();
        double[] doubleArray16 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl17.scalarAdd((double) '#');
        double[] doubleArray21 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) '#');
        boolean boolean25 = realMatrixImpl17.equals((java.lang.Object) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.scalarAdd((double) 10);
        double[] doubleArray29 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl30.scalarAdd((double) '#');
        double[] doubleArray34 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl35.scalarAdd((double) '#');
        boolean boolean38 = realMatrixImpl30.equals((java.lang.Object) realMatrixImpl35);
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarAdd((double) '#');
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.scalarAdd((double) '#');
        boolean boolean49 = realMatrixImpl41.equals((java.lang.Object) realMatrixImpl46);
        int int50 = realMatrixImpl41.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl30.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl41.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl22.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl13.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[][] doubleArray55 = realMatrixImpl41.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl41.transpose();
        boolean boolean57 = realMatrixImpl2.equals((java.lang.Object) realMatrix56);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray59 = realMatrixImpl2.getColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        int int39 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl7.scalarAdd((double) 35);
        double double42 = realMatrixImpl7.getTrace();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl7.scalarAdd((double) (-1.0f));
        double[][] doubleArray45 = realMatrix44.getData();
        double[] doubleArray47 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl48.scalarAdd((double) '#');
        double[] doubleArray52 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl53.scalarAdd((double) '#');
        boolean boolean56 = realMatrixImpl48.equals((java.lang.Object) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl48.scalarMultiply(100.0d);
        double[] doubleArray60 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl48.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrix44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(realMatrix63);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        boolean boolean24 = realMatrixImpl13.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl13.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl13.transpose();
        boolean boolean27 = realMatrix26.isSquare();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-32));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        realMatrixImpl13.luDecompose();
        boolean boolean26 = realMatrixImpl13.isSquare();
        double double27 = realMatrixImpl13.getTrace();
        double[] doubleArray29 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl30.scalarAdd((double) '#');
        double[] doubleArray34 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl35.scalarAdd((double) '#');
        boolean boolean38 = realMatrixImpl30.equals((java.lang.Object) realMatrixImpl35);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.scalarAdd((double) 10);
        double[] doubleArray42 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl43.scalarAdd((double) '#');
        double[] doubleArray47 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl48.scalarAdd((double) '#');
        boolean boolean51 = realMatrixImpl43.equals((java.lang.Object) realMatrixImpl48);
        double[] doubleArray53 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl54.scalarAdd((double) '#');
        double[] doubleArray58 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.scalarAdd((double) '#');
        boolean boolean62 = realMatrixImpl54.equals((java.lang.Object) realMatrixImpl59);
        int int63 = realMatrixImpl54.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl43.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl54.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl35.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        int int67 = realMatrixImpl35.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl35.scalarAdd((double) 35);
        double double70 = realMatrixImpl35.getTrace();
        double[] doubleArray72 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        double[] doubleArray76 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl77.scalarAdd((double) '#');
        double[] doubleArray81 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl82.scalarAdd((double) '#');
        boolean boolean85 = realMatrixImpl77.equals((java.lang.Object) realMatrixImpl82);
        double[] doubleArray87 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        double[] doubleArray89 = realMatrixImpl82.operate(doubleArray87);
        double[] doubleArray90 = realMatrixImpl74.operate(doubleArray87);
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        double[] doubleArray93 = realMatrixImpl35.getColumn(0);
        double[] doubleArray94 = realMatrixImpl13.preMultiply(doubleArray93);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix99 = realMatrixImpl13.getSubMatrix(1079574528, (-1072692971), (int) '#', 1568);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[1.0]");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-3347947978742L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-87L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 1847674149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1847674149 + "'", int2 == 1847674149);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl2.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl2.scalarAdd((-0.5309649148733797d));
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl2.transpose();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = realMatrixImpl2.getRow((-32));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1085443357179641856L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.scalarAdd((double) 10);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        double[] doubleArray36 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl37.scalarAdd((double) '#');
        double[] doubleArray41 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl42.scalarAdd((double) '#');
        boolean boolean45 = realMatrixImpl37.equals((java.lang.Object) realMatrixImpl42);
        int int46 = realMatrixImpl37.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl26.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl37.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl18.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray51 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl18.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[] doubleArray55 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl56.scalarAdd((double) '#');
        double[] doubleArray60 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl61.scalarAdd((double) '#');
        boolean boolean64 = realMatrixImpl56.equals((java.lang.Object) realMatrixImpl61);
        double[] doubleArray66 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        double[] doubleArray68 = realMatrixImpl61.operate(doubleArray66);
        double[] doubleArray69 = realMatrixImpl18.preMultiply(doubleArray66);
        double[] doubleArray70 = realMatrixImpl7.operate(doubleArray66);
        double double71 = realMatrixImpl7.getDeterminant();
        realMatrixImpl7.luDecompose();
        double double73 = realMatrixImpl7.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        realMatrixImpl13.luDecompose();
        boolean boolean26 = realMatrixImpl13.isSquare();
        double double27 = realMatrixImpl13.getTrace();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl13.getRowMatrix(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix29);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.transpose();
        realMatrixImpl13.luDecompose();
        double[] doubleArray27 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.scalarAdd((double) '#');
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        boolean boolean36 = realMatrixImpl28.equals((java.lang.Object) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.scalarAdd((double) 10);
        int int39 = realMatrixImpl33.getRowDimension();
        int int40 = realMatrixImpl33.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl33.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.scalarAdd((double) '#');
        double[] doubleArray49 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl50.scalarAdd((double) '#');
        boolean boolean53 = realMatrixImpl45.equals((java.lang.Object) realMatrixImpl50);
        double[] doubleArray55 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl56.scalarAdd((double) '#');
        double[] doubleArray60 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl61.scalarAdd((double) '#');
        boolean boolean64 = realMatrixImpl56.equals((java.lang.Object) realMatrixImpl61);
        int int65 = realMatrixImpl56.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl45.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl56.transpose();
        realMatrixImpl56.luDecompose();
        double[] doubleArray70 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl71.scalarAdd((double) '#');
        double[] doubleArray75 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl76.scalarAdd((double) '#');
        boolean boolean79 = realMatrixImpl71.equals((java.lang.Object) realMatrixImpl76);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl76.scalarAdd((double) 10);
        int int82 = realMatrixImpl76.getRowDimension();
        int int83 = realMatrixImpl76.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl76.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl56.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl76);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl13.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl13.scalarMultiply((double) 4001056);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertNotNull(realMatrix89);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-608156879));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        boolean boolean24 = realMatrixImpl13.isSquare();
        double[] doubleArray26 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarAdd((double) '#');
        double[] doubleArray31 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl32.scalarAdd((double) '#');
        boolean boolean35 = realMatrixImpl27.equals((java.lang.Object) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.scalarAdd((double) 10);
        int int38 = realMatrixImpl32.getRowDimension();
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarAdd((double) '#');
        double[] doubleArray45 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray47 = realMatrixImpl41.operate(doubleArray45);
        double[] doubleArray48 = realMatrixImpl32.operate(doubleArray47);
        double[] doubleArray49 = realMatrixImpl13.solve(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl13.copy();
        double[][] doubleArray51 = realMatrixImpl13.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray51);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl2.scalarMultiply(100.0d);
        boolean boolean13 = realMatrixImpl2.isSingular();
        double[] doubleArray15 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl16.inverse();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrix17.scalarAdd((double) 52);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl2.preMultiply(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray40 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.scalarAdd((double) '#');
        double[] doubleArray49 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl50.scalarAdd((double) '#');
        boolean boolean53 = realMatrixImpl45.equals((java.lang.Object) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.scalarAdd((double) 10);
        int int56 = realMatrixImpl50.getRowDimension();
        int int57 = realMatrixImpl50.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl50.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl7.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrix59.transpose();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix60);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-1011886072), (-1597020));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray15 = realMatrixImpl7.getData();
        boolean boolean16 = realMatrixImpl7.isSingular();
        double[] doubleArray18 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.scalarAdd((double) '#');
        double[] doubleArray23 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl24.scalarAdd((double) '#');
        boolean boolean27 = realMatrixImpl19.equals((java.lang.Object) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.scalarAdd((double) 10);
        int int30 = realMatrixImpl24.getRowDimension();
        int int31 = realMatrixImpl24.getColumnDimension();
        double[][] doubleArray32 = realMatrixImpl24.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl7.setSubMatrix(doubleArray32, (-807200536), 1087274576);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        double[] doubleArray12 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarAdd((double) '#');
        double[] doubleArray17 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarAdd((double) '#');
        boolean boolean21 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        int int22 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl2.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        boolean boolean24 = realMatrixImpl2.isSingular();
        boolean boolean25 = realMatrixImpl2.isSquare();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        int int39 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray41 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl42.scalarAdd((double) '#');
        double[] doubleArray46 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl47.scalarAdd((double) '#');
        boolean boolean50 = realMatrixImpl42.equals((java.lang.Object) realMatrixImpl47);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.scalarAdd((double) 10);
        double[] doubleArray54 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl55.scalarAdd((double) '#');
        double[] doubleArray59 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl60.scalarAdd((double) '#');
        boolean boolean63 = realMatrixImpl55.equals((java.lang.Object) realMatrixImpl60);
        double[] doubleArray65 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl66.scalarAdd((double) '#');
        double[] doubleArray70 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl71.scalarAdd((double) '#');
        boolean boolean74 = realMatrixImpl66.equals((java.lang.Object) realMatrixImpl71);
        int int75 = realMatrixImpl66.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl55.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl66.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl47.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl7.inverse();
        realMatrixImpl7.luDecompose();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix80);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl7.inverse();
        double[] doubleArray16 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl17.scalarAdd((double) '#');
        double[] doubleArray21 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) '#');
        boolean boolean25 = realMatrixImpl17.equals((java.lang.Object) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl22.getColumnMatrix(46883);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(realMatrix26);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        int int1 = org.apache.commons.math.util.MathUtils.hash(156.3608363030788d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1192192432) + "'", int1 == (-1192192432));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        double[] doubleArray4 = new double[] { 0.0f, 0.0d, 1, 0 };
        double[] doubleArray9 = new double[] { 0.0f, 0.0d, 1, 0 };
        double[][] doubleArray10 = new double[][] { doubleArray4, doubleArray9 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl11.scalarAdd((double) 100L);
        double[] doubleArray15 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.scalarAdd((double) '#');
        double[] doubleArray20 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl21.scalarAdd((double) '#');
        boolean boolean24 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl21);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl16.scalarMultiply(100.0d);
        double[] doubleArray28 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        int int31 = realMatrixImpl29.getColumnDimension();
        double[] doubleArray33 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.scalarAdd((double) '#');
        double[] doubleArray38 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl39.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl34.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl45.inverse();
        double[] doubleArray48 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray50 = realMatrixImpl45.operate(doubleArray48);
        double[] doubleArray51 = realMatrixImpl34.solve(doubleArray50);
        double[] doubleArray52 = realMatrixImpl29.preMultiply(doubleArray50);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = realMatrixImpl11.preMultiply(doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 33479479740585L, (-1291), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-534803777), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        double[] doubleArray15 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.scalarAdd((double) '#');
        double[] doubleArray20 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl21.scalarAdd((double) '#');
        boolean boolean24 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl21);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.scalarAdd((double) 10);
        int int27 = realMatrixImpl21.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl21.inverse();
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        double[] doubleArray35 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.scalarAdd((double) '#');
        boolean boolean39 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl21.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        int int41 = realMatrixImpl36.getColumnDimension();
        double[] doubleArray43 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl36.add(realMatrix46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray50 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        boolean boolean52 = realMatrixImpl51.isSquare();
        boolean boolean53 = realMatrixImpl51.isSingular();
        double[][] doubleArray54 = realMatrixImpl51.getData();
        boolean boolean55 = realMatrixImpl7.equals((java.lang.Object) doubleArray54);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        double[] doubleArray14 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.scalarAdd((double) '#');
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        boolean boolean23 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl20);
        double[] doubleArray25 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarAdd((double) '#');
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        boolean boolean34 = realMatrixImpl26.equals((java.lang.Object) realMatrixImpl31);
        int int35 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl15.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl7.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean39 = realMatrixImpl7.isSingular();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((-1597020.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl7.inverse();
        double[] doubleArray16 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl17.scalarAdd((double) '#');
        double[] doubleArray21 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarAdd((double) '#');
        boolean boolean25 = realMatrixImpl17.equals((java.lang.Object) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl7.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl7.copy();
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray33 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.scalarAdd((double) '#');
        double[] doubleArray38 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl39.scalarAdd((double) '#');
        boolean boolean42 = realMatrixImpl34.equals((java.lang.Object) realMatrixImpl39);
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.scalarAdd((double) '#');
        double[] doubleArray49 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl50.scalarAdd((double) '#');
        boolean boolean53 = realMatrixImpl45.equals((java.lang.Object) realMatrixImpl50);
        int int54 = realMatrixImpl45.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl34.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl45.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl31.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl7.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix58);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        double double4 = realMatrixImpl3.getDeterminant();
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        double[] doubleArray11 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl12.scalarAdd((double) '#');
        boolean boolean15 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.scalarAdd((double) 10);
        double[] doubleArray19 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarAdd((double) '#');
        double[] doubleArray24 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.scalarAdd((double) '#');
        boolean boolean28 = realMatrixImpl20.equals((java.lang.Object) realMatrixImpl25);
        double[] doubleArray30 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarAdd((double) '#');
        double[] doubleArray35 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.scalarAdd((double) '#');
        boolean boolean39 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl36);
        int int40 = realMatrixImpl31.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl20.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl12.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl3.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[][] doubleArray45 = realMatrixImpl31.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.transpose();
        double[] doubleArray48 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl49.scalarAdd((double) '#');
        double[] doubleArray53 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl54.scalarAdd((double) '#');
        boolean boolean57 = realMatrixImpl49.equals((java.lang.Object) realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl49.scalarMultiply(100.0d);
        double[] doubleArray61 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl62.scalarAdd((double) '#');
        double[] doubleArray66 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl67.scalarAdd((double) '#');
        boolean boolean70 = realMatrixImpl62.equals((java.lang.Object) realMatrixImpl67);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl62.scalarMultiply(100.0d);
        double[] doubleArray74 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl62.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrix59.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        boolean boolean78 = realMatrixImpl75.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl31.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        double[][] doubleArray80 = realMatrixImpl75.getData();
        boolean boolean81 = realMatrixImpl75.isSingular();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix3 = realMatrixImpl2.inverse();
        double[] doubleArray5 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl6.inverse();
        boolean boolean8 = realMatrixImpl2.equals((java.lang.Object) realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(52, 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 125994627894133L + "'", long2 == 125994627894133L);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-807200536), 1069547520);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(129, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        double[] doubleArray1 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarAdd((double) '#');
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd((double) '#');
        boolean boolean10 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.scalarAdd((double) 10);
        int int13 = realMatrixImpl7.getRowDimension();
        int int14 = realMatrixImpl7.getColumnDimension();
        double[][] doubleArray15 = realMatrixImpl7.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray18 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.scalarAdd((double) '#');
        double[] doubleArray23 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl24.scalarAdd((double) '#');
        boolean boolean27 = realMatrixImpl19.equals((java.lang.Object) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.scalarAdd((double) 10);
        int int30 = realMatrixImpl24.getRowDimension();
        double[] doubleArray32 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.scalarAdd((double) '#');
        double[] doubleArray37 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray39 = realMatrixImpl33.operate(doubleArray37);
        double[] doubleArray40 = realMatrixImpl24.operate(doubleArray39);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl41.copy();
        double[] doubleArray44 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.scalarAdd((double) '#');
        double[] doubleArray49 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl50.scalarAdd((double) '#');
        boolean boolean53 = realMatrixImpl45.equals((java.lang.Object) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.scalarAdd((double) 10);
        int int56 = realMatrixImpl50.getRowDimension();
        double[] doubleArray58 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.scalarAdd((double) '#');
        double[] doubleArray63 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray65 = realMatrixImpl59.operate(doubleArray63);
        double[] doubleArray66 = realMatrixImpl50.operate(doubleArray65);
        double[] doubleArray67 = realMatrixImpl41.preMultiply(doubleArray66);
        double[] doubleArray69 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl70.scalarAdd((double) '#');
        double[] doubleArray74 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl75.scalarAdd((double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl70.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl16.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl16.inverse();
        java.lang.String str82 = realMatrixImpl16.toString();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str82, "RealMatrixImpl{{-1.0}}");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 0, 46935);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1072693248, (-1238));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }
}

