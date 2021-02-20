import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass24 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
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
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        java.lang.Class<?> wildcardClass17 = bigMatrix16.getClass();
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
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
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double[] doubleArray2 = new double[] { 100.0d, 10.0d };
        double[] doubleArray5 = new double[] { 100.0d, 10.0d };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass25 = realMatrix24.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass22 = bigMatrix21.getClass();
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
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray7 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, (short) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray7, doubleArray11, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(bigMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(bigMatrix31);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = bigMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double[] doubleArray2 = new double[] { 0, 100 };
        double[] doubleArray5 = new double[] { 0, 100 };
        double[] doubleArray8 = new double[] { 0, 100 };
        double[] doubleArray11 = new double[] { 0, 100 };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
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
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
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
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass13 = bigMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
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
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
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
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(bigMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(bigMatrix31);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass9 = bigMatrix8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass20 = bigMatrix19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertNotNull(bigMatrix33);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
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
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
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
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        java.lang.Class<?> wildcardClass20 = bigMatrix19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        double[] doubleArray4 = new double[] { (short) 1, (byte) 10, 100.0d, (-1.0f) };
        org.apache.commons.math.linear.RealMatrix realMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass11 = bigMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
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
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
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
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(bigMatrix32);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = bigMatrix16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        double[] doubleArray2 = new double[] { 100.0d, 10.0d };
        double[] doubleArray5 = new double[] { 100.0d, 10.0d };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix28);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
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
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass34 = doubleArray16.getClass();
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
        org.junit.Assert.assertNotNull(bigMatrix33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass19 = bigMatrix18.getClass();
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
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(bigMatrix32);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        java.lang.Class<?> wildcardClass15 = doubleArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        double[] doubleArray2 = new double[] { 0, 100 };
        double[] doubleArray5 = new double[] { 0, 100 };
        double[] doubleArray8 = new double[] { 0, 100 };
        double[] doubleArray11 = new double[] { 0, 100 };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        java.lang.Class<?> wildcardClass33 = realMatrix32.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass12 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        double[][] doubleArray6 = new double[][] { doubleArray0, doubleArray1, doubleArray2, doubleArray3, doubleArray4, doubleArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray6);
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
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(bigMatrix29);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass11 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
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
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass16 = doubleArray6.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.lang.Class<?> wildcardClass22 = bigMatrix21.getClass();
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
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass11 = bigMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
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
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        double[] doubleArray1 = new double[] { 1.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray1);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray1);
        java.lang.Class<?> wildcardClass5 = realMatrix4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix2);
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass10 = realMatrix9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix16);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
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
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray5);
        java.lang.Class<?> wildcardClass15 = realMatrix14.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        org.apache.commons.math.linear.RealMatrix realMatrix46 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray42);
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
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(bigMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
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
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass11 = bigMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "", "" };
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
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix14);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        double[] doubleArray2 = new double[] { 0, 10L };
        double[] doubleArray5 = new double[] { 0, 10L };
        double[] doubleArray8 = new double[] { 0, 10L };
        double[] doubleArray11 = new double[] { 0, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        double[] doubleArray3 = new double[] { (byte) 0, (short) 1, 10.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray3);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(bigMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass18 = bigMatrix17.getClass();
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
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(bigMatrix29);
        org.junit.Assert.assertNotNull(bigMatrix30);
        org.junit.Assert.assertNotNull(bigMatrix31);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        java.lang.Class<?> wildcardClass22 = bigMatrix21.getClass();
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
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
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
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
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
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(bigMatrix33);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
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
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        java.lang.Class<?> wildcardClass17 = realMatrix16.getClass();
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
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray4);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        double[] doubleArray2 = new double[] { 1, (-1) };
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(bigMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
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
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray12);
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
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
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
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(bigMatrix31);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        double[] doubleArray1 = new double[] { 1.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix3 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix4 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray1);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix2);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(realMatrix5);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(bigMatrix18);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 10.0f, (short) 100, 100.0f };
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 100.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
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
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "" };
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
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        double[] doubleArray5 = new double[] { (-1), 0.0d, 10L, (-1.0d), 100 };
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        org.apache.commons.math.linear.RealMatrix realMatrix16 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
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
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        double[] doubleArray6 = new double[] { (short) 0, 0, 10.0f, 100, (byte) 1, 100.0d };
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(bigMatrix12);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        java.lang.Class<?> wildcardClass14 = bigMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray6);
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
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        double[] doubleArray3 = new double[] { (-1L), 0, (short) 10 };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(bigMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(bigMatrix11);
    }
}

