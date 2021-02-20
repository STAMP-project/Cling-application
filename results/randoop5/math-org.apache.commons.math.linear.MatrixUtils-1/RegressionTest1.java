import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "", "" };
        java.lang.String[][] strArray24 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray4, strArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass22 = realMatrix21.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19, strArray24, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass12 = bigMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass20 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19, strArray24, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass24 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "", "" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass10 = bigMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass26 = realMatrix25.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass8 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass19 = bigMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass25 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass24 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = bigMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass8 = bigMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        double[] doubleArray6 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[] doubleArray20 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[] doubleArray27 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[] doubleArray34 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[] doubleArray41 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[][] doubleArray42 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34, doubleArray41 };
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray42);
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray42);
        java.lang.Class<?> wildcardClass46 = doubleArray42.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 0.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, 0.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 10.0, 0.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0, 0.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0, 0.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0, 0.0, 100.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(bigMatrix43);
        org.junit.Assert.assertNotNull(bigMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray1, strArray3, strArray5, strArray7, strArray9, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = bigMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = bigMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray1, strArray3, strArray5, strArray7, strArray9, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass23 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass18 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass23 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray5, strArray11, strArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        double[] doubleArray2 = new double[] { 0, 100 };
        double[] doubleArray5 = new double[] { 0, 100 };
        double[] doubleArray8 = new double[] { 0, 100 };
        double[] doubleArray11 = new double[] { 0, 100 };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass16 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray4, strArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[][] strArray7 = new java.lang.String[][] { strArray6 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        double[] doubleArray4 = new double[] { (short) 1, (byte) 10, 100.0d, (-1.0f) };
        org.apache.commons.math.linear.RealMatrix realMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass8 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass19 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass26 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass10 = bigMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = bigMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        java.lang.String[][] strArray42 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27, strArray34, strArray41 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix43 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[][] strArray24 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15, strArray19, strArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass28 = realMatrix27.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray2, strArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray5, strArray11, strArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray6, strArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = bigMatrix1.getClass();
        org.junit.Assert.assertNotNull(bigMatrix1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray9 = new java.lang.String[][] { strArray2, strArray5, strArray8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass23 = realMatrix22.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = bigMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String[][] strArray25 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19, strArray24 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass19 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        java.lang.String[][] strArray28 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.lang.String[][] strArray35 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27, strArray34 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix36 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        double[] doubleArray2 = new double[] { 0, 100 };
        double[] doubleArray5 = new double[] { 0, 100 };
        double[] doubleArray8 = new double[] { 0, 100 };
        double[] doubleArray11 = new double[] { 0, 100 };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass29 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass9 = bigMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[][] strArray25 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19, strArray24 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass23 = realMatrix22.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.String[][] strArray25 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19, strArray24 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass19 = realMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        double[] doubleArray1 = new double[] { 1.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray1);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix2);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(bigMatrix4);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19, strArray24, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass15 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        double[] doubleArray2 = new double[] { 100.0f, (byte) 10 };
        double[] doubleArray5 = new double[] { 100.0f, (byte) 10 };
        double[] doubleArray8 = new double[] { 100.0f, (byte) 10 };
        double[] doubleArray11 = new double[] { 100.0f, (byte) 10 };
        double[] doubleArray14 = new double[] { 100.0f, (byte) 10 };
        double[] doubleArray17 = new double[] { 100.0f, (byte) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[][] strArray35 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27, strArray34 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix36 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        java.lang.String[][] strArray35 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27, strArray34 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix36 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = bigMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray3 = new double[] { (-1) };
        double[] doubleArray5 = new double[] { (-1) };
        double[] doubleArray7 = new double[] { (-1) };
        double[][] doubleArray8 = new double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7 };
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray8);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray8);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass11 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass26 = bigMatrix25.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" };
        java.lang.String[][] strArray21 = new java.lang.String[][] { strArray6, strArray13, strArray20 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass25 = bigMatrix24.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass26 = bigMatrix25.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = bigMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        java.lang.String[][] strArray28 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass24 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        java.lang.String[][] strArray35 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27, strArray34 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix36 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(bigMatrix29);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = bigMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass29 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        java.lang.String[][] strArray28 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass8 = bigMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = bigMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray6, strArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        double[] doubleArray6 = new double[] { '4', (byte) 0, (short) -1, (short) 10, 10L, (-1.0d) };
        double[] doubleArray13 = new double[] { '4', (byte) 0, (short) -1, (short) 10, 10L, (-1.0d) };
        double[] doubleArray20 = new double[] { '4', (byte) 0, (short) -1, (short) 10, 10L, (-1.0d) };
        double[] doubleArray27 = new double[] { '4', (byte) 0, (short) -1, (short) 10, 10L, (-1.0d) };
        double[] doubleArray34 = new double[] { '4', (byte) 0, (short) -1, (short) 10, 10L, (-1.0d) };
        double[] doubleArray41 = new double[] { '4', (byte) 0, (short) -1, (short) 10, 10L, (-1.0d) };
        double[][] doubleArray42 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34, doubleArray41 };
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[52.0, 0.0, -1.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 0.0, -1.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 0.0, -1.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 0.0, -1.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[52.0, 0.0, -1.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[52.0, 0.0, -1.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(bigMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray6, strArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        java.lang.String[][] strArray15 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11, strArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[][] strArray42 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27, strArray34, strArray41 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix43 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray4, strArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass26 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass19 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = bigMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        double[] doubleArray3 = new double[] { (byte) 0, (short) 1, 10.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(bigMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        java.lang.String[][] strArray7 = new java.lang.String[][] { strArray6 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!", "" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19, strArray24, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        double[] doubleArray1 = new double[] { 1.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray1);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray1);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix2);
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(bigMatrix4);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        double[] doubleArray1 = new double[] { 1.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray1);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray1);
        java.lang.Class<?> wildcardClass4 = bigMatrix3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix2);
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass19 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass22 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass24 = realMatrix23.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = bigMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass25 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass22 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray3, strArray7, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass16 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        java.lang.Class<?> wildcardClass6 = realMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = bigMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray3, strArray7, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.lang.String[][] strArray24 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[][] strArray25 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19, strArray24 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass9 = bigMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        java.lang.String[][] strArray24 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass31 = bigMatrix30.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass12 = bigMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(bigMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass6 = bigMatrix5.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass19 = bigMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        double[] doubleArray2 = new double[] { 100.0d, 10.0d };
        double[] doubleArray5 = new double[] { 100.0d, 10.0d };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        double[] doubleArray1 = new double[] { 1.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray1);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix2);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(bigMatrix4);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.String[][] strArray24 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass27 = bigMatrix26.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass24 = bigMatrix23.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass19 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass19 = bigMatrix18.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = bigMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[][] strArray7 = new java.lang.String[][] { strArray6 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass20 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = bigMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        java.lang.Class<?> wildcardClass12 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass19 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19, strArray24, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass28 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass24 = realMatrix23.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(bigMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray4, strArray9, strArray14, strArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray6, strArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray1, strArray3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray3 = new double[] { (-1) };
        double[] doubleArray5 = new double[] { (-1) };
        double[] doubleArray7 = new double[] { (-1) };
        double[][] doubleArray8 = new double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7 };
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray8);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray8);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray8);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray8);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[][] strArray7 = new java.lang.String[][] { strArray6 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = realMatrix1.getClass();
        org.junit.Assert.assertNotNull(realMatrix1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass25 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        double[] doubleArray2 = new double[] { 0, 100 };
        double[] doubleArray5 = new double[] { 0, 100 };
        double[] doubleArray8 = new double[] { 0, 100 };
        double[] doubleArray11 = new double[] { 0, 100 };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray3, strArray7 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray3 = new double[] { (-1) };
        double[] doubleArray5 = new double[] { (-1) };
        double[] doubleArray7 = new double[] { (-1) };
        double[][] doubleArray8 = new double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7 };
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray8);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray8);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray8);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray8);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray8);
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.lang.String[][] strArray15 = new java.lang.String[][] { strArray4, strArray9, strArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = bigMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        double[] doubleArray6 = new double[] { ' ', 1.0d, 0.0f, '#', (byte) 100, 1.0f };
        double[] doubleArray13 = new double[] { ' ', 1.0d, 0.0f, '#', (byte) 100, 1.0f };
        double[] doubleArray20 = new double[] { ' ', 1.0d, 0.0f, '#', (byte) 100, 1.0f };
        double[][] doubleArray21 = new double[][] { doubleArray6, doubleArray13, doubleArray20 };
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray21);
        java.lang.Class<?> wildcardClass27 = realMatrix26.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 1.0, 0.0, 35.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 1.0, 0.0, 35.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 1.0, 0.0, 35.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        java.lang.Class<?> wildcardClass11 = bigMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray4, strArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.lang.String[][] strArray35 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27, strArray34 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix36 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass23 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[][] strArray30 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = bigMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = bigMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass21 = bigMatrix20.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = bigMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass19 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        double[] doubleArray2 = new double[] { 100.0d, 10.0d };
        double[] doubleArray5 = new double[] { 100.0d, 10.0d };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray5, strArray11, strArray17, strArray23, strArray29, strArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix37 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass21 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray4, strArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        double[] doubleArray6 = new double[] { ' ', 1.0d, 0.0f, '#', (byte) 100, 1.0f };
        double[] doubleArray13 = new double[] { ' ', 1.0d, 0.0f, '#', (byte) 100, 1.0f };
        double[] doubleArray20 = new double[] { ' ', 1.0d, 0.0f, '#', (byte) 100, 1.0f };
        double[][] doubleArray21 = new double[][] { doubleArray6, doubleArray13, doubleArray20 };
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray21);
        java.lang.Class<?> wildcardClass26 = doubleArray21.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 1.0, 0.0, 35.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 1.0, 0.0, 35.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 1.0, 0.0, 35.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
    }
}

