import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) 'a');
        org.junit.Assert.assertNotNull(bigMatrix1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        double[][] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        double[][] doubleArray6 = new double[][] { doubleArray0, doubleArray1, doubleArray2, doubleArray3, doubleArray4, doubleArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.math.BigDecimal[] bigDecimalArray0 = new java.math.BigDecimal[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.linear.MatrixUtils matrixUtils0 = new org.apache.commons.math.linear.MatrixUtils();
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        double[][] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
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
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) ' ');
        org.junit.Assert.assertNotNull(bigMatrix1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.math.BigDecimal[] bigDecimalArray0 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[][] bigDecimalArray2 = new java.math.BigDecimal[][] { bigDecimalArray0, bigDecimalArray1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray0);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.math.BigDecimal[] bigDecimalArray0 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[][] bigDecimalArray4 = new java.math.BigDecimal[][] { bigDecimalArray0, bigDecimalArray1, bigDecimalArray2, bigDecimalArray3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray0);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray2);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal[][] bigDecimalArray4 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray4);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one row.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
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
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (byte) 100);
        org.junit.Assert.assertNotNull(bigMatrix1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        org.apache.commons.math.linear.BigMatrix bigMatrix2 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigMatrix2);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) ' ');
        org.junit.Assert.assertNotNull(realMatrix1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass10 = bigMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.math.BigDecimal[] bigDecimalArray0 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[][] bigDecimalArray1 = new java.math.BigDecimal[][] { bigDecimalArray0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix2 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray0);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.math.BigDecimal[] bigDecimalArray0 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[][] bigDecimalArray6 = new java.math.BigDecimal[][] { bigDecimalArray0, bigDecimalArray1, bigDecimalArray2, bigDecimalArray3, bigDecimalArray4, bigDecimalArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray0);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray2);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray4);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray6);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "" };
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11, strArray14, strArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.math.BigDecimal[][] bigDecimalArray0 = new java.math.BigDecimal[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one row.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray0, strArray1, strArray2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        org.apache.commons.math.linear.BigMatrix bigMatrix2 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray1);
        java.lang.Class<?> wildcardClass3 = bigMatrix2.getClass();
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigMatrix2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) '#');
        org.junit.Assert.assertNotNull(bigMatrix1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "hi!" };
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one row.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
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
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal[][] bigDecimalArray2 = new java.math.BigDecimal[][] { bigDecimalArray1 };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray2);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray2);
        org.junit.Assert.assertNotNull(bigMatrix3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(10);
        org.junit.Assert.assertNotNull(bigMatrix1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (byte) 1);
        org.junit.Assert.assertNotNull(bigMatrix1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.math.BigDecimal[] bigDecimalArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(100);
        java.lang.Class<?> wildcardClass2 = bigMatrix1.getClass();
        org.junit.Assert.assertNotNull(bigMatrix1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix2 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (short) 10);
        org.junit.Assert.assertNotNull(bigMatrix1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "" };
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "" };
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
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix2 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = bigMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "" };
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.math.BigDecimal[] bigDecimalArray0 = new java.math.BigDecimal[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one row.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass21 = doubleArray16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(10);
        org.junit.Assert.assertNotNull(realMatrix1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass20 = doubleArray16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String[][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "" };
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray1, strArray3, strArray5, strArray7, strArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        java.lang.Class<?> wildcardClass5 = realMatrix4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "hi!" };
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass20 = doubleArray16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix2 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[][] strArray1 = new java.lang.String[][] { strArray0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix2 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass20 = doubleArray16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11, strArray14, strArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "" };
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "" };
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "", "" };
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 10);
        org.junit.Assert.assertNotNull(realMatrix1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        double[][] doubleArray0 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one row.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) '4');
        org.junit.Assert.assertNotNull(realMatrix1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = bigMatrix12.getClass();
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(100);
        java.lang.Class<?> wildcardClass2 = realMatrix1.getClass();
        org.junit.Assert.assertNotNull(realMatrix1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (short) 1);
        org.junit.Assert.assertNotNull(bigMatrix1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = realMatrix1.getClass();
        org.junit.Assert.assertNotNull(realMatrix1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix2 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "hi!" };
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "hi!" };
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray1, strArray3, strArray5, strArray7 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" };
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "" };
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15, strArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.math.BigDecimal[] bigDecimalArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass8 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(1);
        org.junit.Assert.assertNotNull(bigMatrix1);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (short) 10);
        org.junit.Assert.assertNotNull(realMatrix1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) '4');
        org.junit.Assert.assertNotNull(bigMatrix1);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) 'a');
        org.junit.Assert.assertNotNull(realMatrix1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.lang.Class<?> wildcardClass18 = bigMatrix17.getClass();
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(1);
        java.lang.Class<?> wildcardClass2 = realMatrix1.getClass();
        org.junit.Assert.assertNotNull(realMatrix1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) '#');
        org.junit.Assert.assertNotNull(realMatrix1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        double[] doubleArray6 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[] doubleArray13 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[] doubleArray20 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[] doubleArray27 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[] doubleArray34 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[] doubleArray41 = new double[] { 1.0d, (short) 10, 0, 100.0f, (short) -1, 'a' };
        double[][] doubleArray42 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34, doubleArray41 };
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray42);
        java.lang.Class<?> wildcardClass44 = bigMatrix43.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = bigMatrix1.getClass();
        org.junit.Assert.assertNotNull(bigMatrix1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" };
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
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
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "" };
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11, strArray14, strArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "", "" };
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray0, strArray1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.math.BigDecimal[][] bigDecimalArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 1);
        org.junit.Assert.assertNotNull(realMatrix1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one row.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.math.BigDecimal[] bigDecimalArray0 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray4 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[][] bigDecimalArray5 = new java.math.BigDecimal[][] { bigDecimalArray0, bigDecimalArray1, bigDecimalArray2, bigDecimalArray3, bigDecimalArray4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray0);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray2);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray4);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" };
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (short) 1);
        org.junit.Assert.assertNotNull(realMatrix1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass21 = realMatrix20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass10 = bigMatrix9.getClass();
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "" };
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "", "" };
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "", "hi!", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "hi!", "" };
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray1, strArray3, strArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        double[] doubleArray2 = new double[] { 0, 100 };
        double[] doubleArray5 = new double[] { 0, 100 };
        double[] doubleArray8 = new double[] { 0, 100 };
        double[] doubleArray11 = new double[] { 0, 100 };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "" };
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15, strArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass20 = bigMatrix19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!", "" };
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal[][] bigDecimalArray10 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9 };
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!" };
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "" };
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "" };
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.lang.Class<?> wildcardClass17 = bigMatrix16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass8 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass9 = realMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass12 = bigMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal[][] bigDecimalArray6 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5 };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray6);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray6);
        org.junit.Assert.assertNotNull(bigMatrix7);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        java.lang.String[][] strArray20 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15, strArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray1, strArray3, strArray5, strArray7, strArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "", "" };
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray3 = new double[] { (short) 1 };
        double[] doubleArray5 = new double[] { (short) 1 };
        double[] doubleArray7 = new double[] { (short) 1 };
        double[] doubleArray9 = new double[] { (short) 1 };
        double[][] doubleArray10 = new double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7, doubleArray9 };
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray10);
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray1, strArray3, strArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = bigMatrix14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass13 = bigMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "" };
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = bigMatrix14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "hi!" };
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "" };
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = bigMatrix16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "" };
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.lang.Class<?> wildcardClass20 = doubleArray6.getClass();
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!", "" };
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = bigMatrix12.getClass();
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass8 = realMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "hi!" };
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "" };
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" };
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "hi!" };
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "" };
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "", "" };
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
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray1, strArray3, strArray5, strArray7 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!" };
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.lang.Class<?> wildcardClass27 = realMatrix26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "hi!" };
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "", "" };
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "" };
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "" };
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.math.BigDecimal[] bigDecimalArray0 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[] {};
        java.math.BigDecimal[][] bigDecimalArray3 = new java.math.BigDecimal[][] { bigDecimalArray0, bigDecimalArray1, bigDecimalArray2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray0);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray2);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "" };
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!" };
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "" };
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = bigMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
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
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.Class<?> wildcardClass19 = realMatrix18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "" };
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal[][] bigDecimalArray8 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7 };
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray8);
        java.lang.Class<?> wildcardClass10 = bigMatrix9.getClass();
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        double[][] doubleArray4 = new double[][] { doubleArray0, doubleArray1, doubleArray2, doubleArray3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must have at least one column.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass7 = realMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass7 = bigMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11, strArray14, strArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "", "", "", "" };
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "", "" };
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!", "", "", "" };
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass7 = bigMatrix6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = bigMatrix14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "hi!" };
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "", "hi!" };
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "" };
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        java.math.BigDecimal bigDecimal2 = null;
        java.math.BigDecimal[] bigDecimalArray3 = new java.math.BigDecimal[] { bigDecimal2 };
        java.math.BigDecimal bigDecimal4 = null;
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal6 = null;
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal8 = null;
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] { bigDecimal8 };
        java.math.BigDecimal bigDecimal10 = null;
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray1, bigDecimalArray3, bigDecimalArray5, bigDecimalArray7, bigDecimalArray9, bigDecimalArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertNotNull(bigDecimalArray3);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
        org.junit.Assert.assertNotNull(bigDecimalArray11);
        org.junit.Assert.assertNotNull(bigDecimalArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "" };
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
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
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "" };
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "" };
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "" };
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass8 = bigMatrix7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "", "" };
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = bigMatrix11.getClass();
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        java.lang.Class<?> wildcardClass19 = realMatrix18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "", "hi!" };
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass27 = doubleArray16.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.lang.Class<?> wildcardClass28 = bigMatrix27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
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
}

