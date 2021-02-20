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
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl48.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl50.getNorm();
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl50.getDataRef();
        int int53 = bigMatrixImpl50.getColumnDimension();
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl50.getNorm();
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal bigDecimal69 = bigMatrixImpl68.getNorm();
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal69 };
        java.math.BigDecimal[] bigDecimalArray71 = bigMatrixImpl34.preMultiply(bigDecimalArray70);
        double[] doubleArray74 = new double[] { (short) 10, 100L };
        double[] doubleArray77 = new double[] { (short) 10, 100L };
        double[] doubleArray80 = new double[] { (short) 10, 100L };
        double[] doubleArray83 = new double[] { (short) 10, 100L };
        double[][] doubleArray84 = new double[][] { doubleArray74, doubleArray77, doubleArray80, doubleArray83 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray84);
        java.math.BigDecimal[][] bigDecimalArray86 = bigMatrixImpl85.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray86);
        java.math.BigDecimal bigDecimal88 = bigMatrixImpl87.getNorm();
        java.math.BigDecimal[][] bigDecimalArray89 = bigMatrixImpl87.getDataRef();
        int int90 = bigMatrixImpl87.getColumnDimension();
        java.math.BigDecimal bigDecimal91 = bigMatrixImpl87.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix92 = bigMatrixImpl34.scalarMultiply(bigDecimal91);
        java.math.BigDecimal[][] bigDecimalArray93 = bigMatrixImpl34.getData();
        java.math.BigDecimal bigDecimal94 = bigMatrixImpl34.getNorm();
        java.math.BigDecimal[][] bigDecimalArray95 = bigMatrixImpl34.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray97 = bigMatrixImpl34.getRow((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(bigDecimalArray49);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimalArray70);
        org.junit.Assert.assertNotNull(bigDecimalArray71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(bigDecimalArray86);
        org.junit.Assert.assertNotNull(bigDecimal88);
        org.junit.Assert.assertNotNull(bigDecimalArray89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertNotNull(bigDecimal91);
        org.junit.Assert.assertNotNull(bigMatrix92);
        org.junit.Assert.assertNotNull(bigDecimalArray93);
        org.junit.Assert.assertNotNull(bigDecimal94);
        org.junit.Assert.assertNotNull(bigDecimalArray95);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        int int34 = bigMatrixImpl33.getRoundingMode();
        int int35 = bigMatrixImpl33.getScale();
        double[][] doubleArray36 = bigMatrixImpl33.getDataAsDoubleArray();
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl33.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        double[][] doubleArray29 = bigMatrixImpl28.getDataAsDoubleArray();
        bigMatrixImpl28.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl28);
        double[] doubleArray34 = bigMatrixImpl28.getColumnAsDoubleArray(0);
        int int35 = bigMatrixImpl28.getColumnDimension();
        bigMatrixImpl28.setRoundingMode(1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal[] bigDecimalArray20 = bigMatrixImpl15.getColumn((int) (byte) 1);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl15.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl22.getColumnMatrix((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
        org.junit.Assert.assertNotNull(bigDecimalArray21);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.lang.String str35 = bigMatrixImpl34.toString();
        int int36 = bigMatrixImpl34.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal37 = bigMatrixImpl34.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "BigMatrixImpl{{400},{400}}" + "'", str35, "BigMatrixImpl{{400},{400}}");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 100, (int) (byte) 1);
        bigMatrixImpl2.setScale((int) '4');
        boolean boolean5 = bigMatrixImpl2.isSquare();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        int int15 = bigMatrixImpl13.getScale();
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl13.getNorm();
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl30.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray31);
        java.math.BigDecimal bigDecimal33 = bigMatrixImpl32.getNorm();
        java.math.BigDecimal[][] bigDecimalArray34 = bigMatrixImpl32.getDataRef();
        int int35 = bigMatrixImpl32.getColumnDimension();
        java.math.BigDecimal bigDecimal36 = bigMatrixImpl32.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = bigMatrixImpl13.scalarMultiply(bigDecimal36);
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl51.getData();
        int int53 = bigMatrixImpl51.getScale();
        java.math.BigDecimal[] bigDecimalArray55 = bigMatrixImpl51.getColumn(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        java.math.BigDecimal[] bigDecimalArray57 = bigMatrixImpl13.preMultiply(bigDecimalArray55);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        // The following exception was thrown during execution in test generation
        try {
            bigMatrixImpl58.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(bigDecimalArray31);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimalArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 64 + "'", int53 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray55);
        org.junit.Assert.assertNotNull(bigDecimalArray57);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        java.math.BigDecimal[] bigDecimalArray16 = bigMatrixImpl13.getRow(0);
        bigMatrixImpl13.setRoundingMode(10);
        bigMatrixImpl13.setRoundingMode(4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigDecimalArray16);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        boolean boolean17 = bigMatrixImpl16.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl16.getRowMatrix(2);
        java.lang.String str20 = bigMatrixImpl16.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl16.copy();
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        int int37 = bigMatrixImpl35.getScale();
        java.math.BigDecimal[] bigDecimalArray39 = bigMatrixImpl35.getColumn(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        java.math.BigDecimal[] bigDecimalArray41 = bigMatrixImpl16.preMultiply(bigDecimalArray39);
        java.math.BigDecimal bigDecimal42 = bigMatrixImpl16.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str20, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(bigDecimalArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
        org.junit.Assert.assertNotNull(bigDecimalArray41);
        org.junit.Assert.assertNotNull(bigDecimal42);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getData();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl17.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray19, 4, 0);
        int int23 = bigMatrixImpl2.getScale();
        boolean boolean24 = bigMatrixImpl2.isSingular();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigDecimalArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        double[][] doubleArray28 = bigMatrixImpl27.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        int int30 = bigMatrixImpl29.getColumnDimension();
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl29.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.scalarAdd(bigDecimal31);
        boolean boolean33 = bigMatrixImpl13.isSquare();
        double[][] doubleArray34 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[][] doubleArray48 = new double[][] { doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        java.math.BigDecimal bigDecimal50 = bigMatrixImpl49.getNorm();
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[] doubleArray56 = new double[] { (short) 10, 100L };
        double[] doubleArray59 = new double[] { (short) 10, 100L };
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[][] doubleArray63 = new double[][] { doubleArray53, doubleArray56, doubleArray59, doubleArray62 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray63);
        double[][] doubleArray65 = bigMatrixImpl64.getDataAsDoubleArray();
        bigMatrixImpl64.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl49.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl64);
        int int69 = bigMatrixImpl49.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix70 = bigMatrixImpl35.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl49);
        java.math.BigDecimal[][] bigDecimalArray71 = bigMatrixImpl35.getData();
        int int72 = bigMatrixImpl35.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(bigMatrix68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 64 + "'", int69 == 64);
        org.junit.Assert.assertNotNull(bigMatrix70);
        org.junit.Assert.assertNotNull(bigDecimalArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4 + "'", int72 == 4);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        int int15 = bigMatrixImpl13.getRowDimension();
        boolean boolean16 = bigMatrixImpl13.isSquare();
        int int17 = bigMatrixImpl13.getScale();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 10, (int) 'a');
        int int21 = bigMatrixImpl20.getScale();
        boolean boolean22 = bigMatrixImpl13.equals((java.lang.Object) bigMatrixImpl20);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray1);
        bigMatrixImpl2.setScale((int) (byte) 1);
        int int5 = bigMatrixImpl2.getColumnDimension();
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl2.getTrace();
        int[] intArray12 = new int[] { '4', ' ', 'a', (byte) -1, (short) -1 };
        int[] intArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl2.getSubMatrix(intArray12, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[52, 32, 97, -1, -1]");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        int int15 = bigMatrixImpl13.getRowDimension();
        boolean boolean16 = bigMatrixImpl13.isSquare();
        int int17 = bigMatrixImpl13.getScale();
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl13.getData();
        double[][] doubleArray19 = bigMatrixImpl13.getDataAsDoubleArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = bigMatrixImpl13.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray18);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        int int19 = bigMatrixImpl16.getRowDimension();
        bigMatrixImpl16.setRoundingMode((int) (short) 0);
        java.lang.String str22 = bigMatrixImpl16.toString();
        int int23 = bigMatrixImpl16.getColumnDimension();
        java.math.BigDecimal bigDecimal24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl16.scalarMultiply(bigDecimal24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str22, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double[] doubleArray2 = new double[] { 1.0f, 4 };
        double[] doubleArray5 = new double[] { 1.0f, 4 };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl7 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray6);
        boolean boolean8 = bigMatrixImpl7.isSquare();
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl22.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23);
        bigMatrixImpl25.setRoundingMode((int) (short) 100);
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[][] doubleArray40 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray40);
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl41.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        java.math.BigDecimal bigDecimal44 = bigMatrixImpl43.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl25.scalarAdd(bigDecimal44);
        double[] doubleArray47 = bigMatrixImpl25.getRowAsDoubleArray((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray48 = bigMatrixImpl7.solve(doubleArray47);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: Matrix is singular.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(bigDecimalArray42);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigMatrix45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        int int17 = bigMatrixImpl16.getColumnDimension();
        double[][] doubleArray18 = bigMatrixImpl16.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl19.getSubMatrix((int) (byte) 100, 0, 97, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        java.lang.String str15 = bigMatrixImpl13.toString();
        int int16 = bigMatrixImpl13.getScale();
        int int17 = bigMatrixImpl13.getScale();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str15, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 100, 32);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl2.getSubMatrix((int) (short) 1, 2, 0, 2);
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        double[][] doubleArray22 = bigMatrixImpl21.getDataAsDoubleArray();
        java.math.BigDecimal[] bigDecimalArray24 = bigMatrixImpl21.getRow(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray26 = bigMatrixImpl2.preMultiply(bigDecimalArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        int int15 = bigMatrixImpl13.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.transpose();
        int int17 = bigMatrixImpl13.getRowDimension();
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getData();
        bigMatrixImpl31.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray35 = bigMatrixImpl31.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl50.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        java.math.BigDecimal bigDecimal53 = bigMatrixImpl52.getNorm();
        java.math.BigDecimal[][] bigDecimalArray54 = bigMatrixImpl52.getDataRef();
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal[][] bigDecimalArray69 = bigMatrixImpl68.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray69);
        java.math.BigDecimal bigDecimal71 = bigMatrixImpl70.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrixImpl52.scalarMultiply(bigDecimal71);
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl36.scalarMultiply(bigDecimal71);
        org.apache.commons.math.linear.BigMatrix bigMatrix74 = bigMatrixImpl13.scalarAdd(bigDecimal71);
        java.lang.Class<?> wildcardClass75 = bigDecimal71.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(bigDecimalArray35);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimalArray54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(bigDecimalArray69);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigMatrix72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertNotNull(bigMatrix74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 1, (int) ' ');
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        double[][] doubleArray31 = bigMatrixImpl30.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        int int33 = bigMatrixImpl32.getColumnDimension();
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl32.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl16.scalarAdd(bigDecimal34);
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[][] doubleArray48 = new double[][] { doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        java.math.BigDecimal[][] bigDecimalArray50 = bigMatrixImpl49.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl49.copy();
        boolean boolean52 = bigMatrixImpl49.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix53 = bigMatrixImpl49.transpose();
        java.lang.String str54 = bigMatrixImpl49.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl49.copy();
        boolean boolean56 = bigMatrixImpl16.equals((java.lang.Object) bigMatrix55);
        double[] doubleArray59 = new double[] { (short) 10, 100L };
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[] doubleArray65 = new double[] { (short) 10, 100L };
        double[] doubleArray68 = new double[] { (short) 10, 100L };
        double[][] doubleArray69 = new double[][] { doubleArray59, doubleArray62, doubleArray65, doubleArray68 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray69);
        java.math.BigDecimal[][] bigDecimalArray71 = bigMatrixImpl70.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray71);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray71);
        bigMatrixImpl73.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl73.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix77 = bigMatrixImpl73.copy();
        double[] doubleArray79 = bigMatrixImpl73.getColumnAsDoubleArray((int) (short) 1);
        java.math.BigDecimal[][] bigDecimalArray80 = bigMatrixImpl73.getDataRef();
        int int81 = bigMatrixImpl73.getColumnDimension();
        java.math.BigDecimal bigDecimal82 = bigMatrixImpl73.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix83 = bigMatrixImpl16.scalarAdd(bigDecimal82);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix84 = bigMatrixImpl2.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(bigDecimalArray50);
        org.junit.Assert.assertNotNull(bigMatrix51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bigMatrix53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str54, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertNotNull(bigMatrix55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertNotNull(bigDecimalArray71);
        org.junit.Assert.assertNotNull(bigMatrix76);
        org.junit.Assert.assertNotNull(bigMatrix77);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertNotNull(bigMatrix83);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        int int15 = bigMatrixImpl13.getRowDimension();
        bigMatrixImpl13.setScale((int) (byte) 100);
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        double[][] doubleArray32 = bigMatrixImpl31.getDataAsDoubleArray();
        java.math.BigDecimal[] bigDecimalArray34 = bigMatrixImpl31.getRow(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl31.getRowMatrix(1);
        boolean boolean37 = bigMatrixImpl13.equals((java.lang.Object) bigMatrixImpl31);
        double[][] doubleArray38 = bigMatrixImpl31.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(bigDecimalArray34);
        org.junit.Assert.assertNotNull(bigMatrix36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl15.getNorm();
        int int20 = bigMatrixImpl15.getRoundingMode();
        bigMatrixImpl15.setScale(97);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl15.copy();
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[][] doubleArray36 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getData();
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl37.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl15.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(bigDecimalArray38);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal[] bigDecimalArray20 = bigMatrixImpl15.getColumn((int) (byte) 1);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl15.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        int int23 = bigMatrixImpl22.getRowDimension();
        int int24 = bigMatrixImpl22.getScale();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
        org.junit.Assert.assertNotNull(bigDecimalArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl13.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl27);
        int int30 = bigMatrixImpl13.getRoundingMode();
        double[][] doubleArray31 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertNotNull(bigMatrix29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(bigMatrix32);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        bigMatrixImpl13.setRoundingMode(100);
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl30.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.subtract(bigMatrix31);
        boolean boolean33 = bigMatrixImpl13.isSquare();
        boolean boolean34 = bigMatrixImpl13.isSingular();
        boolean boolean35 = bigMatrixImpl13.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        int int16 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl15.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl15.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimalArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl34.copy();
        int int36 = bigMatrixImpl34.getScale();
        boolean boolean38 = bigMatrixImpl34.equals((java.lang.Object) (byte) 100);
        int int39 = bigMatrixImpl34.getRoundingMode();
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[] doubleArray51 = new double[] { (short) 10, 100L };
        double[][] doubleArray52 = new double[][] { doubleArray42, doubleArray45, doubleArray48, doubleArray51 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray52);
        java.math.BigDecimal[][] bigDecimalArray54 = bigMatrixImpl53.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray54);
        java.math.BigDecimal bigDecimal56 = bigMatrixImpl55.getNorm();
        java.math.BigDecimal bigDecimal57 = bigMatrixImpl55.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = bigMatrixImpl34.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl55);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(bigMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(bigDecimalArray54);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigMatrix58);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        int int34 = bigMatrixImpl33.getRoundingMode();
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal bigDecimal49 = bigMatrixImpl48.getNorm();
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[] doubleArray55 = new double[] { (short) 10, 100L };
        double[] doubleArray58 = new double[] { (short) 10, 100L };
        double[] doubleArray61 = new double[] { (short) 10, 100L };
        double[][] doubleArray62 = new double[][] { doubleArray52, doubleArray55, doubleArray58, doubleArray61 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray62);
        java.math.BigDecimal[][] bigDecimalArray64 = bigMatrixImpl63.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64);
        java.math.BigDecimal bigDecimal66 = bigMatrixImpl65.getNorm();
        java.math.BigDecimal[] bigDecimalArray67 = new java.math.BigDecimal[] { bigDecimal49, bigDecimal66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray67);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray67);
        double[] doubleArray72 = new double[] { (short) 10, 100L };
        double[] doubleArray75 = new double[] { (short) 10, 100L };
        double[] doubleArray78 = new double[] { (short) 10, 100L };
        double[] doubleArray81 = new double[] { (short) 10, 100L };
        double[][] doubleArray82 = new double[][] { doubleArray72, doubleArray75, doubleArray78, doubleArray81 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl83 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray82);
        java.math.BigDecimal[][] bigDecimalArray84 = bigMatrixImpl83.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray84);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl86 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray84);
        org.apache.commons.math.linear.BigMatrix bigMatrix87 = bigMatrixImpl69.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl86);
        boolean boolean88 = bigMatrixImpl86.isSingular();
        java.math.BigDecimal bigDecimal89 = bigMatrixImpl86.getNorm();
        java.math.BigDecimal[] bigDecimalArray91 = bigMatrixImpl86.getRow(0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray92 = bigMatrixImpl33.solve(bigDecimalArray91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(bigDecimalArray64);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimalArray67);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertNotNull(bigDecimalArray84);
        org.junit.Assert.assertNotNull(bigMatrix87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(bigDecimal89);
        org.junit.Assert.assertNotNull(bigDecimalArray91);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl29.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.math.BigDecimal bigDecimal32 = bigMatrixImpl31.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl15.scalarAdd(bigDecimal32);
        double[] doubleArray35 = bigMatrixImpl15.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl15.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        java.math.BigDecimal[] bigDecimalArray41 = bigMatrixImpl39.getRow((int) (byte) 1);
        java.lang.String str42 = bigMatrixImpl39.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(bigDecimalArray30);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray36);
        org.junit.Assert.assertNotNull(bigDecimalArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str42, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        int int16 = bigMatrixImpl15.getScale();
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl30.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray31);
        java.math.BigDecimal bigDecimal33 = bigMatrixImpl32.getNorm();
        java.math.BigDecimal[][] bigDecimalArray34 = bigMatrixImpl32.getDataRef();
        int int35 = bigMatrixImpl32.getColumnDimension();
        java.math.BigDecimal bigDecimal36 = bigMatrixImpl32.getNorm();
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl32.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getDataRef();
        boolean boolean40 = bigMatrixImpl15.equals((java.lang.Object) bigMatrixImpl38);
        double[][] doubleArray41 = bigMatrixImpl15.getDataAsDoubleArray();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = bigMatrixImpl15.getColumnAsDoubleArray((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(bigDecimalArray31);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimalArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double[] doubleArray2 = new double[] { 1.0f, 4 };
        double[] doubleArray5 = new double[] { 1.0f, 4 };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl7 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray6);
        java.math.BigDecimal[][] bigDecimalArray8 = bigMatrixImpl7.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(bigDecimalArray8);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl48.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl50.getNorm();
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl50.getDataRef();
        int int53 = bigMatrixImpl50.getColumnDimension();
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl50.getNorm();
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal bigDecimal69 = bigMatrixImpl68.getNorm();
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal69 };
        java.math.BigDecimal[] bigDecimalArray71 = bigMatrixImpl34.preMultiply(bigDecimalArray70);
        double[] doubleArray74 = new double[] { (short) 10, 100L };
        double[] doubleArray77 = new double[] { (short) 10, 100L };
        double[] doubleArray80 = new double[] { (short) 10, 100L };
        double[] doubleArray83 = new double[] { (short) 10, 100L };
        double[][] doubleArray84 = new double[][] { doubleArray74, doubleArray77, doubleArray80, doubleArray83 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray84);
        java.math.BigDecimal[][] bigDecimalArray86 = bigMatrixImpl85.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray86);
        java.math.BigDecimal bigDecimal88 = bigMatrixImpl87.getNorm();
        java.math.BigDecimal[][] bigDecimalArray89 = bigMatrixImpl87.getDataRef();
        int int90 = bigMatrixImpl87.getColumnDimension();
        java.math.BigDecimal bigDecimal91 = bigMatrixImpl87.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix92 = bigMatrixImpl34.scalarMultiply(bigDecimal91);
        java.math.BigDecimal[][] bigDecimalArray93 = bigMatrixImpl34.getData();
        java.math.BigDecimal bigDecimal94 = bigMatrixImpl34.getNorm();
        java.lang.String str95 = bigMatrixImpl34.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(bigDecimalArray49);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimalArray70);
        org.junit.Assert.assertNotNull(bigDecimalArray71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(bigDecimalArray86);
        org.junit.Assert.assertNotNull(bigDecimal88);
        org.junit.Assert.assertNotNull(bigDecimalArray89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertNotNull(bigDecimal91);
        org.junit.Assert.assertNotNull(bigMatrix92);
        org.junit.Assert.assertNotNull(bigDecimalArray93);
        org.junit.Assert.assertNotNull(bigDecimal94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "BigMatrixImpl{{400},{400}}" + "'", str95, "BigMatrixImpl{{400},{400}}");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '#', 32);
        int int3 = bigMatrixImpl2.getColumnDimension();
        int int4 = bigMatrixImpl2.getRoundingMode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        int int19 = bigMatrixImpl16.getRowDimension();
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray22, doubleArray25, doubleArray28, doubleArray31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl33.copy();
        java.math.BigDecimal[][] bigDecimalArray35 = bigMatrixImpl33.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl16.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(bigMatrix34);
        org.junit.Assert.assertNotNull(bigDecimalArray35);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        int int16 = bigMatrixImpl15.getScale();
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl30.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray31);
        java.math.BigDecimal bigDecimal33 = bigMatrixImpl32.getNorm();
        java.math.BigDecimal[][] bigDecimalArray34 = bigMatrixImpl32.getDataRef();
        int int35 = bigMatrixImpl32.getColumnDimension();
        java.math.BigDecimal bigDecimal36 = bigMatrixImpl32.getNorm();
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl32.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getDataRef();
        boolean boolean40 = bigMatrixImpl15.equals((java.lang.Object) bigMatrixImpl38);
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl38.getColumnMatrix((int) (short) 0);
        java.math.BigDecimal[] bigDecimalArray44 = bigMatrixImpl38.getRow(0);
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl38.getData();
        boolean boolean46 = bigMatrixImpl38.isSquare();
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl38.getData();
        double[][] doubleArray48 = bigMatrixImpl38.getDataAsDoubleArray();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(bigDecimalArray31);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimalArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(bigMatrix42);
        org.junit.Assert.assertNotNull(bigDecimalArray44);
        org.junit.Assert.assertNotNull(bigDecimalArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray47);
        org.junit.Assert.assertNotNull(doubleArray48);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = bigMatrixImpl16.getColumnAsDoubleArray(4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        java.lang.String str3 = bigMatrixImpl0.toString();
        int[] intArray8 = new int[] { (byte) 100, 0, 97, 1 };
        int[] intArray9 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl0.getSubMatrix(intArray8, intArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: selected row and column index arrays must be non-empty");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BigMatrixImpl{}" + "'", str3, "BigMatrixImpl{}");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 97, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl34.copy();
        java.math.BigDecimal bigDecimal36 = bigMatrixImpl34.getNorm();
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl34.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl34.multiply(bigMatrix38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(bigMatrix35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl29.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.math.BigDecimal bigDecimal32 = bigMatrixImpl31.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl15.scalarAdd(bigDecimal32);
        double[] doubleArray35 = bigMatrixImpl15.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl15.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        double[][] doubleArray52 = bigMatrixImpl51.getDataAsDoubleArray();
        bigMatrixImpl51.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl51.transpose();
        double[] doubleArray58 = new double[] { (short) 10, 100L };
        double[] doubleArray61 = new double[] { (short) 10, 100L };
        double[] doubleArray64 = new double[] { (short) 10, 100L };
        double[] doubleArray67 = new double[] { (short) 10, 100L };
        double[][] doubleArray68 = new double[][] { doubleArray58, doubleArray61, doubleArray64, doubleArray67 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray68);
        double[] doubleArray72 = new double[] { (short) 10, 100L };
        double[] doubleArray75 = new double[] { (short) 10, 100L };
        double[] doubleArray78 = new double[] { (short) 10, 100L };
        double[] doubleArray81 = new double[] { (short) 10, 100L };
        double[][] doubleArray82 = new double[][] { doubleArray72, doubleArray75, doubleArray78, doubleArray81 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl83 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray82);
        double[][] doubleArray84 = bigMatrixImpl83.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray84);
        int int86 = bigMatrixImpl85.getColumnDimension();
        java.math.BigDecimal bigDecimal87 = bigMatrixImpl85.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix88 = bigMatrixImpl69.scalarAdd(bigDecimal87);
        boolean boolean89 = bigMatrixImpl69.isSquare();
        double[][] doubleArray90 = bigMatrixImpl69.getDataAsDoubleArray();
        java.math.BigDecimal bigDecimal91 = bigMatrixImpl69.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix92 = bigMatrixImpl51.scalarMultiply(bigDecimal91);
        org.apache.commons.math.linear.BigMatrix bigMatrix93 = bigMatrixImpl37.scalarAdd(bigDecimal91);
        java.math.BigDecimal[][] bigDecimalArray94 = bigMatrixImpl37.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(bigDecimalArray30);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray36);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(bigMatrix55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertNotNull(bigDecimal87);
        org.junit.Assert.assertNotNull(bigMatrix88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertNotNull(bigDecimal91);
        org.junit.Assert.assertNotNull(bigMatrix92);
        org.junit.Assert.assertNotNull(bigMatrix93);
        org.junit.Assert.assertNotNull(bigDecimalArray94);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[] doubleArray15 = bigMatrixImpl13.getColumnAsDoubleArray((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray17 = bigMatrixImpl13.getColumn(100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl48.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl34.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl51);
        java.lang.String str53 = bigMatrixImpl34.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = bigMatrixImpl34.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(bigDecimalArray49);
        org.junit.Assert.assertNotNull(bigMatrix52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "BigMatrixImpl{{400},{400}}" + "'", str53, "BigMatrixImpl{{400},{400}}");
        org.junit.Assert.assertNotNull(bigMatrix54);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        double[][] doubleArray28 = bigMatrixImpl27.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        int int30 = bigMatrixImpl29.getColumnDimension();
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl29.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.scalarAdd(bigDecimal31);
        boolean boolean33 = bigMatrixImpl13.isSquare();
        double[][] doubleArray34 = bigMatrixImpl13.getDataAsDoubleArray();
        java.math.BigDecimal[][] bigDecimalArray35 = bigMatrixImpl13.getData();
        int int36 = bigMatrixImpl13.getRowDimension();
        boolean boolean37 = bigMatrixImpl13.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(bigDecimalArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        boolean boolean35 = bigMatrixImpl34.isSquare();
        bigMatrixImpl34.setScale((int) 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(4, (int) (byte) 1);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        org.junit.Assert.assertNotNull(bigDecimalArray3);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        double[][] doubleArray28 = bigMatrixImpl27.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        int int30 = bigMatrixImpl29.getColumnDimension();
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl29.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.scalarAdd(bigDecimal31);
        boolean boolean33 = bigMatrixImpl13.isSquare();
        double[][] doubleArray34 = bigMatrixImpl13.getDataAsDoubleArray();
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl13.getNorm();
        int int36 = bigMatrixImpl13.getColumnDimension();
        int int37 = bigMatrixImpl13.getRoundingMode();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        java.math.BigDecimal[] bigDecimalArray16 = bigMatrixImpl13.getRow(0);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl13.getDataRef();
        java.lang.String str18 = bigMatrixImpl13.toString();
        int[] intArray25 = new int[] { 1, (short) 10, 0, 32, 32, (byte) 100 };
        int[] intArray30 = new int[] { 4, (short) 10, 32, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl13.getSubMatrix(intArray25, intArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertNotNull(bigDecimalArray16);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str18, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 10, 0, 32, 32, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[4, 10, 32, -1]");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.lang.String str35 = bigMatrixImpl34.toString();
        int int36 = bigMatrixImpl34.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl34.getRowMatrix((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "BigMatrixImpl{{400},{400}}" + "'", str35, "BigMatrixImpl{{400},{400}}");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', 100);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl16.copy();
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl16.getRow(0);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl16.getDataRef();
        boolean boolean21 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl16);
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[][] doubleArray48 = new double[][] { doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        double[][] doubleArray50 = bigMatrixImpl49.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        int int52 = bigMatrixImpl51.getColumnDimension();
        java.math.BigDecimal bigDecimal53 = bigMatrixImpl51.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = bigMatrixImpl35.scalarAdd(bigDecimal53);
        bigMatrixImpl35.setRoundingMode((int) ' ');
        double[] doubleArray58 = bigMatrixImpl35.getColumnAsDoubleArray((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray59 = bigMatrixImpl2.operate(doubleArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigMatrix54);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl13.copy();
        boolean boolean16 = bigMatrixImpl13.isSquare();
        bigMatrixImpl13.setScale((int) (byte) 100);
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        bigMatrixImpl32.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl51.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl53.getNorm();
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl53.getDataRef();
        double[] doubleArray58 = new double[] { (short) 10, 100L };
        double[] doubleArray61 = new double[] { (short) 10, 100L };
        double[] doubleArray64 = new double[] { (short) 10, 100L };
        double[] doubleArray67 = new double[] { (short) 10, 100L };
        double[][] doubleArray68 = new double[][] { doubleArray58, doubleArray61, doubleArray64, doubleArray67 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray68);
        java.math.BigDecimal[][] bigDecimalArray70 = bigMatrixImpl69.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray70);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl71.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl53.scalarMultiply(bigDecimal72);
        org.apache.commons.math.linear.BigMatrix bigMatrix74 = bigMatrixImpl37.scalarMultiply(bigDecimal72);
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrixImpl13.scalarAdd(bigDecimal72);
        int int76 = bigMatrixImpl13.getColumnDimension();
        int int77 = bigMatrixImpl13.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrixImpl13.getRowMatrix((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(bigDecimalArray33);
        org.junit.Assert.assertNotNull(bigDecimalArray36);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimalArray55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertNotNull(bigDecimalArray70);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertNotNull(bigMatrix74);
        org.junit.Assert.assertNotNull(bigMatrix75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl29.getData();
        boolean boolean31 = bigMatrixImpl15.equals((java.lang.Object) bigMatrixImpl29);
        int int32 = bigMatrixImpl15.getRoundingMode();
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[][] doubleArray45 = new double[][] { doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        java.math.BigDecimal bigDecimal47 = bigMatrixImpl46.getNorm();
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[] doubleArray56 = new double[] { (short) 10, 100L };
        double[] doubleArray59 = new double[] { (short) 10, 100L };
        double[][] doubleArray60 = new double[][] { doubleArray50, doubleArray53, doubleArray56, doubleArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray60);
        double[][] doubleArray62 = bigMatrixImpl61.getDataAsDoubleArray();
        bigMatrixImpl61.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix65 = bigMatrixImpl46.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl61);
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl15.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl61);
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[] doubleArray72 = new double[] { (short) 10, 100L };
        double[] doubleArray75 = new double[] { (short) 10, 100L };
        double[] doubleArray78 = new double[] { (short) 10, 100L };
        double[][] doubleArray79 = new double[][] { doubleArray69, doubleArray72, doubleArray75, doubleArray78 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = bigMatrixImpl80.copy();
        java.math.BigDecimal bigDecimal82 = bigMatrixImpl80.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix83 = bigMatrixImpl15.scalarAdd(bigDecimal82);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(bigDecimalArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(bigMatrix65);
        org.junit.Assert.assertNotNull(bigMatrix66);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertNotNull(bigMatrix81);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertNotNull(bigMatrix83);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        int int15 = bigMatrixImpl13.getRowDimension();
        bigMatrixImpl13.setScale((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl13.getSubMatrix((int) ' ', 0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.String[] strArray6 = new java.lang.String[] { "BigMatrixImpl{{null}}", "BigMatrixImpl{}", "hi!", "hi!", "BigMatrixImpl{{null}}", "BigMatrixImpl{}" };
        java.lang.String[] strArray13 = new java.lang.String[] { "BigMatrixImpl{{null}}", "BigMatrixImpl{}", "hi!", "hi!", "BigMatrixImpl{{null}}", "BigMatrixImpl{}" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray6, strArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        java.math.BigDecimal bigDecimal5 = bigMatrixImpl2.getEntry((int) (byte) 10, 0);
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl2.getDataRef();
        int int7 = bigMatrixImpl2.getColumnDimension();
        boolean boolean8 = bigMatrixImpl2.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl2.getColumnMatrix((int) (short) 0);
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimalArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(bigMatrix10);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setScale((int) ' ');
        int int9 = bigMatrixImpl0.getScale();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BigMatrixImpl{}" + "'", str3, "BigMatrixImpl{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        boolean boolean17 = bigMatrixImpl16.isSquare();
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl16.getRow((int) (byte) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        int int21 = bigMatrixImpl20.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray23 = bigMatrixImpl20.getRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        double[][] doubleArray20 = bigMatrixImpl19.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        boolean boolean23 = bigMatrixImpl22.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        bigMatrixImpl13.setRoundingMode(100);
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl30.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.subtract(bigMatrix31);
        boolean boolean33 = bigMatrixImpl13.isSquare();
        boolean boolean34 = bigMatrixImpl13.isSingular();
        int int35 = bigMatrixImpl13.getRowDimension();
        java.math.BigDecimal bigDecimal36 = bigMatrixImpl13.getNorm();
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl50.getNorm();
        bigMatrixImpl50.setScale((int) (short) 10);
        boolean boolean54 = bigMatrixImpl50.isSquare();
        int int55 = bigMatrixImpl50.getRowDimension();
        boolean boolean56 = bigMatrixImpl13.equals((java.lang.Object) bigMatrixImpl50);
        boolean boolean57 = bigMatrixImpl13.isSquare();
        int[] intArray62 = new int[] { '4', (byte) -1, '#', 32 };
        int[] intArray68 = new int[] { 4, 97, (short) 10, (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix69 = bigMatrixImpl13.getSubMatrix(intArray62, intArray68);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[52, -1, 35, 32]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[4, 97, 10, 10, -1]");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        int int16 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getRoundingMode();
        java.math.BigDecimal[] bigDecimalArray20 = bigMatrixImpl15.getRow((int) (short) 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        bigMatrixImpl21.setScale((int) '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray1);
        java.lang.String str3 = bigMatrixImpl2.toString();
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl2.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl2.getColumnMatrix((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bigMatrixImpl2.luDecompose();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BigMatrixImpl{{null}}" + "'", str3, "BigMatrixImpl{{null}}");
        org.junit.Assert.assertNotNull(bigDecimalArray4);
        org.junit.Assert.assertNotNull(bigMatrix6);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl16.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl16.copy();
        double[] doubleArray22 = bigMatrixImpl16.getColumnAsDoubleArray((int) (short) 1);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl16.getDataRef();
        int int24 = bigMatrixImpl16.getColumnDimension();
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl16.getNorm();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl16.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray27 = bigMatrixImpl16.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimalArray26);
        org.junit.Assert.assertNotNull(bigDecimalArray27);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal[][] bigDecimalArray35 = bigMatrixImpl34.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl34.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl34.getColumnMatrix(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl34.getRowMatrix((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(bigDecimalArray35);
        org.junit.Assert.assertNotNull(bigDecimalArray36);
        org.junit.Assert.assertNotNull(bigMatrix38);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 100, 32);
        java.math.BigDecimal[] bigDecimalArray4 = bigMatrixImpl2.getRow(32);
        boolean boolean5 = bigMatrixImpl2.isSingular();
        org.junit.Assert.assertNotNull(bigDecimalArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray1);
        bigMatrixImpl2.setScale((int) (byte) 1);
        int int5 = bigMatrixImpl2.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigMatrixImpl2.getEntry(2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl34.copy();
        int int36 = bigMatrixImpl34.getScale();
        bigMatrixImpl34.setRoundingMode((int) (short) 100);
        int int39 = bigMatrixImpl34.getScale();
        java.math.BigDecimal bigDecimal40 = bigMatrixImpl34.getNorm();
        boolean boolean41 = bigMatrixImpl34.isSquare();
        bigMatrixImpl34.setRoundingMode(100);
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[] doubleArray55 = new double[] { (short) 10, 100L };
        double[][] doubleArray56 = new double[][] { doubleArray46, doubleArray49, doubleArray52, doubleArray55 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray56);
        double[][] doubleArray58 = bigMatrixImpl57.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray58);
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[] doubleArray65 = new double[] { (short) 10, 100L };
        double[] doubleArray68 = new double[] { (short) 10, 100L };
        double[] doubleArray71 = new double[] { (short) 10, 100L };
        double[][] doubleArray72 = new double[][] { doubleArray62, doubleArray65, doubleArray68, doubleArray71 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        java.math.BigDecimal[][] bigDecimalArray74 = bigMatrixImpl73.getData();
        int int75 = bigMatrixImpl73.getScale();
        java.math.BigDecimal bigDecimal76 = bigMatrixImpl73.getNorm();
        java.math.BigDecimal bigDecimal77 = bigMatrixImpl73.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = bigMatrixImpl59.scalarAdd(bigDecimal77);
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrixImpl34.scalarAdd(bigDecimal77);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(bigMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertNotNull(bigDecimalArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 64 + "'", int75 == 64);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigMatrix78);
        org.junit.Assert.assertNotNull(bigMatrix79);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.math.BigDecimal bigDecimal0 = null;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] { bigDecimal0 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray1);
        java.lang.String str3 = bigMatrixImpl2.toString();
        int int4 = bigMatrixImpl2.getRowDimension();
        int int5 = bigMatrixImpl2.getRoundingMode();
        int int6 = bigMatrixImpl2.getScale();
        org.junit.Assert.assertNotNull(bigDecimalArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BigMatrixImpl{{null}}" + "'", str3, "BigMatrixImpl{{null}}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        int int15 = bigMatrixImpl13.getRowDimension();
        boolean boolean16 = bigMatrixImpl13.isSquare();
        int int17 = bigMatrixImpl13.getScale();
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray18);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        bigMatrixImpl13.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl13.transpose();
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = bigMatrixImpl13.transpose();
        int int19 = bigMatrixImpl13.getRoundingMode();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        boolean boolean17 = bigMatrixImpl16.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl16.getRowMatrix(2);
        java.lang.String str20 = bigMatrixImpl16.toString();
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl16.getNorm();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl16.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str20, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl16.scalarAdd(bigDecimal35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl16.getData();
        java.lang.String str38 = bigMatrixImpl16.toString();
        java.math.BigDecimal[] bigDecimalArray40 = bigMatrixImpl16.getRow((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = bigMatrixImpl16.getRowAsDoubleArray((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(bigDecimalArray33);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigMatrix36);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str38, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertNotNull(bigDecimalArray40);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl13.getData();
        int int18 = bigMatrixImpl13.getScale();
        double[][] doubleArray19 = bigMatrixImpl13.getDataAsDoubleArray();
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray22, doubleArray25, doubleArray28, doubleArray31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        double[] doubleArray35 = bigMatrixImpl33.getColumnAsDoubleArray((int) (byte) 0);
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[][] doubleArray48 = new double[][] { doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        java.math.BigDecimal bigDecimal50 = bigMatrixImpl49.getNorm();
        bigMatrixImpl49.setScale((int) (short) 10);
        double[] doubleArray55 = new double[] { (short) 10, 100L };
        double[] doubleArray58 = new double[] { (short) 10, 100L };
        double[] doubleArray61 = new double[] { (short) 10, 100L };
        double[] doubleArray64 = new double[] { (short) 10, 100L };
        double[][] doubleArray65 = new double[][] { doubleArray55, doubleArray58, doubleArray61, doubleArray64 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = bigMatrixImpl66.copy();
        int int68 = bigMatrixImpl66.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix69 = bigMatrixImpl66.transpose();
        double[] doubleArray72 = new double[] { (short) 10, 100L };
        double[] doubleArray75 = new double[] { (short) 10, 100L };
        double[] doubleArray78 = new double[] { (short) 10, 100L };
        double[] doubleArray81 = new double[] { (short) 10, 100L };
        double[][] doubleArray82 = new double[][] { doubleArray72, doubleArray75, doubleArray78, doubleArray81 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl83 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray82);
        java.math.BigDecimal bigDecimal84 = bigMatrixImpl83.getNorm();
        boolean boolean85 = bigMatrixImpl66.equals((java.lang.Object) bigDecimal84);
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = bigMatrixImpl49.scalarAdd(bigDecimal84);
        org.apache.commons.math.linear.BigMatrix bigMatrix87 = bigMatrixImpl33.scalarAdd(bigDecimal84);
        java.math.BigDecimal[][] bigDecimalArray88 = bigMatrixImpl33.getData();
        // The following exception was thrown during execution in test generation
        try {
            bigMatrixImpl13.setSubMatrix(bigDecimalArray88, 32, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(bigMatrix67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 4 + "'", int68 == 4);
        org.junit.Assert.assertNotNull(bigMatrix69);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertNotNull(bigDecimal84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(bigMatrix86);
        org.junit.Assert.assertNotNull(bigMatrix87);
        org.junit.Assert.assertNotNull(bigDecimalArray88);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        double[] doubleArray37 = bigMatrixImpl35.getRowAsDoubleArray((int) (byte) 0);
        int int38 = bigMatrixImpl35.getRoundingMode();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[400.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 10, (int) 'a');
        int int3 = bigMatrixImpl2.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl2.copy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNotNull(bigMatrix4);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl16.scalarAdd(bigDecimal35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        int int39 = bigMatrixImpl38.getColumnDimension();
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[] doubleArray51 = new double[] { (short) 10, 100L };
        double[][] doubleArray52 = new double[][] { doubleArray42, doubleArray45, doubleArray48, doubleArray51 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray52);
        double[][] doubleArray54 = bigMatrixImpl53.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { (short) 10, 100L };
        double[] doubleArray61 = new double[] { (short) 10, 100L };
        double[] doubleArray64 = new double[] { (short) 10, 100L };
        double[] doubleArray67 = new double[] { (short) 10, 100L };
        double[][] doubleArray68 = new double[][] { doubleArray58, doubleArray61, doubleArray64, doubleArray67 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray68);
        java.math.BigDecimal[][] bigDecimalArray70 = bigMatrixImpl69.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray70);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl71.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl55.scalarAdd(bigDecimal72);
        double[] doubleArray75 = bigMatrixImpl55.getColumnAsDoubleArray(0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray76 = bigMatrixImpl38.solve(doubleArray75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(bigDecimalArray33);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigMatrix36);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertNotNull(bigDecimalArray70);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl30.copy();
        int int32 = bigMatrixImpl30.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl30.transpose();
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[][] doubleArray46 = new double[][] { doubleArray36, doubleArray39, doubleArray42, doubleArray45 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray46);
        java.math.BigDecimal bigDecimal48 = bigMatrixImpl47.getNorm();
        boolean boolean49 = bigMatrixImpl30.equals((java.lang.Object) bigDecimal48);
        java.lang.String str50 = bigMatrixImpl30.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl30.getRowMatrix(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix53 = bigMatrixImpl13.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl30);
        double[][] doubleArray54 = bigMatrixImpl13.getDataAsDoubleArray();
        int int55 = bigMatrixImpl13.getRowDimension();
        bigMatrixImpl13.setRoundingMode((int) '#');
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[][] doubleArray70 = new double[][] { doubleArray60, doubleArray63, doubleArray66, doubleArray69 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        java.math.BigDecimal[][] bigDecimalArray72 = bigMatrixImpl71.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray72);
        double[] doubleArray75 = bigMatrixImpl73.getColumnAsDoubleArray((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray76 = bigMatrixImpl13.solve(doubleArray75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(bigMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str50, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertNotNull(bigMatrix52);
        org.junit.Assert.assertNotNull(bigMatrix53);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(bigDecimalArray72);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        double[][] doubleArray28 = bigMatrixImpl27.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        int int30 = bigMatrixImpl29.getColumnDimension();
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl29.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.scalarAdd(bigDecimal31);
        bigMatrixImpl13.setRoundingMode((int) ' ');
        java.math.BigDecimal[][] bigDecimalArray35 = bigMatrixImpl13.getData();
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[][] doubleArray48 = new double[][] { doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        java.math.BigDecimal[][] bigDecimalArray50 = bigMatrixImpl49.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray50);
        java.math.BigDecimal bigDecimal52 = bigMatrixImpl51.getNorm();
        java.math.BigDecimal[][] bigDecimalArray53 = bigMatrixImpl51.getDataRef();
        int int54 = bigMatrixImpl51.getColumnDimension();
        java.math.BigDecimal bigDecimal55 = bigMatrixImpl51.getNorm();
        double[][] doubleArray56 = bigMatrixImpl51.getDataAsDoubleArray();
        double[] doubleArray58 = bigMatrixImpl51.getRowAsDoubleArray(0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray59 = bigMatrixImpl13.operate(doubleArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertNotNull(bigDecimalArray35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(bigDecimalArray50);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimalArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        bigMatrixImpl13.setScale((int) (short) 10);
        bigMatrixImpl13.setScale(97);
        int int19 = bigMatrixImpl13.getRowDimension();
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl13.getData();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = bigMatrixImpl13.getEntryAsDouble((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        java.lang.Class<?> wildcardClass18 = bigMatrixImpl17.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl16.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl16.copy();
        int int21 = bigMatrixImpl16.getRowDimension();
        boolean boolean22 = bigMatrixImpl16.isSquare();
        java.math.BigDecimal[] bigDecimalArray24 = bigMatrixImpl16.getColumn(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        int[] intArray30 = new int[] { (short) 100, (-1), (byte) 10, '4' };
        int[] intArray33 = new int[] { (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl25.getSubMatrix(intArray30, intArray33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, -1, 10, 52]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 0]");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl29.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.math.BigDecimal bigDecimal32 = bigMatrixImpl31.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl15.scalarAdd(bigDecimal32);
        double[] doubleArray35 = bigMatrixImpl15.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl15.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl37.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(bigDecimalArray30);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray36);
        org.junit.Assert.assertNotNull(bigDecimal38);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl48.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl50.getNorm();
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl50.getDataRef();
        int int53 = bigMatrixImpl50.getColumnDimension();
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl50.getNorm();
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal bigDecimal69 = bigMatrixImpl68.getNorm();
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal69 };
        java.math.BigDecimal[] bigDecimalArray71 = bigMatrixImpl34.preMultiply(bigDecimalArray70);
        double[] doubleArray74 = new double[] { (short) 10, 100L };
        double[] doubleArray77 = new double[] { (short) 10, 100L };
        double[] doubleArray80 = new double[] { (short) 10, 100L };
        double[] doubleArray83 = new double[] { (short) 10, 100L };
        double[][] doubleArray84 = new double[][] { doubleArray74, doubleArray77, doubleArray80, doubleArray83 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray84);
        java.math.BigDecimal[][] bigDecimalArray86 = bigMatrixImpl85.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray86);
        java.math.BigDecimal bigDecimal88 = bigMatrixImpl87.getNorm();
        java.math.BigDecimal[][] bigDecimalArray89 = bigMatrixImpl87.getDataRef();
        int int90 = bigMatrixImpl87.getColumnDimension();
        java.math.BigDecimal bigDecimal91 = bigMatrixImpl87.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix92 = bigMatrixImpl34.scalarMultiply(bigDecimal91);
        java.math.BigDecimal[][] bigDecimalArray93 = bigMatrixImpl34.getData();
        java.math.BigDecimal bigDecimal94 = bigMatrixImpl34.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray96 = bigMatrixImpl34.getRow(97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(bigDecimalArray49);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimalArray70);
        org.junit.Assert.assertNotNull(bigDecimalArray71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(bigDecimalArray86);
        org.junit.Assert.assertNotNull(bigDecimal88);
        org.junit.Assert.assertNotNull(bigDecimalArray89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertNotNull(bigDecimal91);
        org.junit.Assert.assertNotNull(bigMatrix92);
        org.junit.Assert.assertNotNull(bigDecimalArray93);
        org.junit.Assert.assertNotNull(bigDecimal94);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        int int34 = bigMatrixImpl33.getRoundingMode();
        bigMatrixImpl33.setScale(0);
        bigMatrixImpl33.setScale((int) (byte) -1);
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[][] doubleArray51 = new double[][] { doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray51);
        java.math.BigDecimal[][] bigDecimalArray53 = bigMatrixImpl52.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        bigMatrixImpl55.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = bigMatrixImpl55.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = bigMatrixImpl55.copy();
        int int60 = bigMatrixImpl55.getRowDimension();
        boolean boolean61 = bigMatrixImpl55.isSquare();
        java.math.BigDecimal[] bigDecimalArray63 = bigMatrixImpl55.getColumn(0);
        java.math.BigDecimal[][] bigDecimalArray64 = bigMatrixImpl55.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64);
        // The following exception was thrown during execution in test generation
        try {
            bigMatrixImpl33.setSubMatrix(bigDecimalArray64, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(bigDecimalArray53);
        org.junit.Assert.assertNotNull(bigMatrix58);
        org.junit.Assert.assertNotNull(bigMatrix59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray63);
        org.junit.Assert.assertNotNull(bigDecimalArray64);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        int int15 = bigMatrixImpl13.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.copy();
        boolean boolean17 = bigMatrixImpl13.isSingular();
        int int18 = bigMatrixImpl13.getColumnDimension();
        int int19 = bigMatrixImpl13.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = bigMatrixImpl13.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        int int16 = bigMatrixImpl15.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl15.getNorm();
        double[][] doubleArray20 = bigMatrixImpl15.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl21.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bigMatrixImpl21.getEntryAsDouble(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(bigDecimal22);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl16.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl16.copy();
        double[] doubleArray22 = bigMatrixImpl16.getColumnAsDoubleArray((int) (short) 1);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl16.getDataRef();
        int int24 = bigMatrixImpl16.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = bigMatrixImpl16.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl16.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl16.copy();
        boolean boolean21 = bigMatrixImpl16.isSingular();
        int int22 = bigMatrixImpl16.getRoundingMode();
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[][] doubleArray51 = new double[][] { doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray51);
        java.math.BigDecimal[][] bigDecimalArray53 = bigMatrixImpl52.getData();
        boolean boolean54 = bigMatrixImpl38.equals((java.lang.Object) bigMatrixImpl52);
        java.math.BigDecimal bigDecimal55 = bigMatrixImpl52.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl16.scalarAdd(bigDecimal55);
        java.math.BigDecimal bigDecimal57 = bigMatrixImpl16.getNorm();
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[][] doubleArray70 = new double[][] { doubleArray60, doubleArray63, doubleArray66, doubleArray69 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrixImpl71.copy();
        int int73 = bigMatrixImpl71.getRowDimension();
        boolean boolean74 = bigMatrixImpl71.isSquare();
        int int75 = bigMatrixImpl71.getScale();
        java.math.BigDecimal[][] bigDecimalArray76 = bigMatrixImpl71.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray76);
        java.math.BigDecimal[] bigDecimalArray79 = bigMatrixImpl77.getRow(1);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray79);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray81 = bigMatrixImpl16.solve(bigDecimalArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(bigDecimalArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigMatrix56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(bigMatrix72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 4 + "'", int73 == 4);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 64 + "'", int75 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray76);
        org.junit.Assert.assertNotNull(bigDecimalArray79);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl15.getDataRef();
        bigMatrixImpl15.setRoundingMode((int) (byte) 10);
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl38.getNorm();
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl38.getDataRef();
        int int41 = bigMatrixImpl38.getColumnDimension();
        java.math.BigDecimal bigDecimal42 = bigMatrixImpl38.getNorm();
        java.math.BigDecimal[][] bigDecimalArray43 = bigMatrixImpl38.getDataRef();
        java.math.BigDecimal bigDecimal44 = bigMatrixImpl38.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl15.scalarAdd(bigDecimal44);
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl15.getData();
        int int47 = bigMatrixImpl15.getScale();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimalArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimalArray43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigMatrix45);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 64 + "'", int47 == 64);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl15.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl15.getData();
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        double[][] doubleArray36 = bigMatrixImpl35.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl51.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl53.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl37.scalarAdd(bigDecimal54);
        double[] doubleArray57 = bigMatrixImpl37.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray58 = bigMatrixImpl37.getData();
        int int59 = bigMatrixImpl37.getRoundingMode();
        double[][] doubleArray60 = bigMatrixImpl37.getDataAsDoubleArray();
        int int61 = bigMatrixImpl37.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl15.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
        org.junit.Assert.assertNotNull(bigDecimalArray21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigMatrix55);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        boolean boolean17 = bigMatrixImpl16.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl16.getRowMatrix(2);
        java.lang.String str20 = bigMatrixImpl16.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl16.transpose();
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl16.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str20, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigMatrix22);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.lang.String str43 = bigMatrixImpl42.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "BigMatrixImpl{{400},{400}}" + "'", str43, "BigMatrixImpl{{400},{400}}");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl29.getData();
        int int31 = bigMatrixImpl29.getScale();
        java.math.BigDecimal bigDecimal32 = bigMatrixImpl29.getNorm();
        java.math.BigDecimal bigDecimal33 = bigMatrixImpl29.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl15.scalarAdd(bigDecimal33);
        int int35 = bigMatrixImpl15.getColumnDimension();
        int int36 = bigMatrixImpl15.getRoundingMode();
        bigMatrixImpl15.setRoundingMode(0);
        int int39 = bigMatrixImpl15.getScale();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(bigDecimalArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigMatrix34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        boolean boolean15 = bigMatrixImpl13.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl15.getDataRef();
        double[] doubleArray22 = bigMatrixImpl15.getColumnAsDoubleArray((int) (byte) 0);
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        double[][] doubleArray37 = bigMatrixImpl36.getDataAsDoubleArray();
        bigMatrixImpl36.setRoundingMode((int) (short) 0);
        bigMatrixImpl36.setScale((int) (short) 100);
        java.math.BigDecimal[] bigDecimalArray43 = bigMatrixImpl36.getColumn((int) (short) 1);
        java.math.BigDecimal[] bigDecimalArray44 = bigMatrixImpl15.preMultiply(bigDecimalArray43);
        java.lang.String str45 = bigMatrixImpl15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl15.getColumnMatrix(32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(bigDecimalArray43);
        org.junit.Assert.assertNotNull(bigDecimalArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str45, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        boolean boolean17 = bigMatrixImpl16.isSquare();
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        java.math.BigDecimal[][] bigDecimalArray35 = bigMatrixImpl33.getDataRef();
        int int36 = bigMatrixImpl33.getColumnDimension();
        java.math.BigDecimal bigDecimal37 = bigMatrixImpl33.getNorm();
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl51.copy();
        int int53 = bigMatrixImpl51.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = bigMatrixImpl51.transpose();
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal bigDecimal69 = bigMatrixImpl68.getNorm();
        boolean boolean70 = bigMatrixImpl51.equals((java.lang.Object) bigDecimal69);
        org.apache.commons.math.linear.BigMatrix bigMatrix71 = bigMatrixImpl33.scalarMultiply(bigDecimal69);
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrixImpl16.scalarMultiply(bigDecimal69);
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl16.transpose();
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrixImpl16.getRowMatrix(0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal76 = bigMatrixImpl16.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimalArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(bigMatrix52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(bigMatrix54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(bigMatrix71);
        org.junit.Assert.assertNotNull(bigMatrix72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertNotNull(bigMatrix75);
    }
}

