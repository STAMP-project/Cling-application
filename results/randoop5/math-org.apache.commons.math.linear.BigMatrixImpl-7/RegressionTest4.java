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
        java.lang.String[] strArray5 = new java.lang.String[] { "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}", "", "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}", "", "BigMatrixImpl{}" };
        java.lang.String[] strArray11 = new java.lang.String[] { "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}", "", "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}", "", "BigMatrixImpl{}" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
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
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl50.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        bigMatrixImpl53.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl53.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix57 = bigMatrixImpl16.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl53);
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[][] doubleArray70 = new double[][] { doubleArray60, doubleArray63, doubleArray66, doubleArray69 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        double[][] doubleArray72 = bigMatrixImpl71.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        int int78 = bigMatrixImpl77.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrixImpl16.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl77);
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
        org.junit.Assert.assertNotNull(bigMatrix56);
        org.junit.Assert.assertNotNull(bigMatrix57);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertNotNull(bigMatrix79);
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
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.lang.String str35 = bigMatrixImpl34.toString();
        int int36 = bigMatrixImpl34.getColumnDimension();
        java.math.BigDecimal[] bigDecimalArray38 = bigMatrixImpl34.getRow((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal41 = bigMatrixImpl34.getEntry((int) (short) 1, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(bigDecimalArray38);
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
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl18.getData();
        double[][] doubleArray20 = bigMatrixImpl18.getDataAsDoubleArray();
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
        org.junit.Assert.assertNotNull(bigDecimalArray19);
        org.junit.Assert.assertNotNull(doubleArray20);
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
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        int int15 = bigMatrixImpl13.getScale();
        java.math.BigDecimal[] bigDecimalArray17 = bigMatrixImpl13.getColumn(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl13.getSubMatrix((-1), (-1), (int) (short) 1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        bigMatrixImpl40.setScale(10);
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
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl15.scalarMultiply(bigDecimal34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl15.getData();
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl50.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        boolean boolean54 = bigMatrixImpl53.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl53.getRowMatrix(2);
        java.lang.String str57 = bigMatrixImpl53.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = bigMatrixImpl53.copy();
        double[] doubleArray61 = new double[] { (short) 10, 100L };
        double[] doubleArray64 = new double[] { (short) 10, 100L };
        double[] doubleArray67 = new double[] { (short) 10, 100L };
        double[] doubleArray70 = new double[] { (short) 10, 100L };
        double[][] doubleArray71 = new double[][] { doubleArray61, doubleArray64, doubleArray67, doubleArray70 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray71);
        java.math.BigDecimal[][] bigDecimalArray73 = bigMatrixImpl72.getData();
        int int74 = bigMatrixImpl72.getScale();
        java.math.BigDecimal[] bigDecimalArray76 = bigMatrixImpl72.getColumn(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray76);
        java.math.BigDecimal[] bigDecimalArray78 = bigMatrixImpl53.preMultiply(bigDecimalArray76);
        java.lang.Class<?> wildcardClass79 = bigMatrixImpl53.getClass();
        boolean boolean80 = bigMatrixImpl15.equals((java.lang.Object) wildcardClass79);
        int int81 = bigMatrixImpl15.getColumnDimension();
        double[] doubleArray83 = bigMatrixImpl15.getColumnAsDoubleArray((int) (byte) 1);
        java.math.BigDecimal[] bigDecimalArray85 = bigMatrixImpl15.getColumn((int) (short) 1);
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
        org.junit.Assert.assertNotNull(bigMatrix35);
        org.junit.Assert.assertNotNull(bigDecimalArray36);
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(bigMatrix56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str57, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertNotNull(bigMatrix58);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(bigDecimalArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 64 + "'", int74 == 64);
        org.junit.Assert.assertNotNull(bigDecimalArray76);
        org.junit.Assert.assertNotNull(bigDecimalArray78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray85);
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
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl34.getRowMatrix((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray45 = bigMatrixImpl34.getRow((-1));
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
        org.junit.Assert.assertNotNull(bigMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bigMatrix43);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        double[][] doubleArray16 = bigMatrixImpl15.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = bigMatrixImpl17.copy();
        java.lang.String str19 = bigMatrixImpl17.toString();
        int[] intArray21 = new int[] { (byte) 100 };
        int[] intArray28 = new int[] { (byte) 100, (short) -1, '#', 1, (byte) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl17.getSubMatrix(intArray21, intArray28);
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str19, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, -1, 35, 1, 100, 52]");
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
        boolean boolean78 = bigMatrixImpl13.isSingular();
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
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
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
        double[][] doubleArray54 = bigMatrixImpl34.getDataAsDoubleArray();
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal[][] bigDecimalArray69 = bigMatrixImpl68.getData();
        java.math.BigDecimal[][] bigDecimalArray70 = bigMatrixImpl68.getData();
        int int71 = bigMatrixImpl68.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl68.getRowMatrix(2);
        org.apache.commons.math.linear.BigMatrix bigMatrix74 = bigMatrixImpl34.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl68);
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrixImpl68.transpose();
        int int76 = bigMatrixImpl68.getRowDimension();
        java.math.BigDecimal[][] bigDecimalArray77 = bigMatrixImpl68.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray77);
        int int79 = bigMatrixImpl78.getColumnDimension();
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
        org.junit.Assert.assertNotNull(doubleArray54);
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
        org.junit.Assert.assertNotNull(bigDecimalArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 4 + "'", int71 == 4);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertNotNull(bigMatrix74);
        org.junit.Assert.assertNotNull(bigMatrix75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertNotNull(bigDecimalArray77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl38.getRowMatrix((int) (byte) 0);
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[][] doubleArray53 = new double[][] { doubleArray43, doubleArray46, doubleArray49, doubleArray52 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray53);
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl54.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        java.math.BigDecimal bigDecimal57 = bigMatrixImpl56.getNorm();
        java.math.BigDecimal[][] bigDecimalArray58 = bigMatrixImpl56.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.math.BigDecimal[][] bigDecimalArray60 = bigMatrixImpl59.getData();
        int int61 = bigMatrixImpl59.getRowDimension();
        double[] doubleArray63 = bigMatrixImpl59.getColumnAsDoubleArray((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray64 = bigMatrixImpl38.solve(doubleArray63);
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
        org.junit.Assert.assertNotNull(bigMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertNotNull(bigDecimalArray55);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimalArray58);
        org.junit.Assert.assertNotNull(bigDecimalArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 10.0, 10.0, 10.0]");
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
        boolean boolean76 = bigMatrixImpl13.isSingular();
        bigMatrixImpl13.setScale((int) '#');
        boolean boolean79 = bigMatrixImpl13.isSingular();
        java.math.BigDecimal[][] bigDecimalArray80 = bigMatrixImpl13.getData();
        java.math.BigDecimal[] bigDecimalArray82 = bigMatrixImpl13.getColumn((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray80);
        org.junit.Assert.assertNotNull(bigDecimalArray82);
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
        int int35 = bigMatrixImpl34.getRowDimension();
        java.lang.String str36 = bigMatrixImpl34.toString();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "BigMatrixImpl{{400},{400}}" + "'", str36, "BigMatrixImpl{{400},{400}}");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl13.copy();
        int int34 = bigMatrixImpl13.getRoundingMode();
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl48.copy();
        java.math.BigDecimal[][] bigDecimalArray50 = bigMatrixImpl48.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray50);
        java.math.BigDecimal[] bigDecimalArray53 = bigMatrixImpl51.getColumn((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray54 = bigMatrixImpl13.operate(bigDecimalArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
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
        org.junit.Assert.assertNotNull(bigMatrix33);
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
        org.junit.Assert.assertNotNull(bigMatrix49);
        org.junit.Assert.assertNotNull(bigDecimalArray50);
        org.junit.Assert.assertNotNull(bigDecimalArray53);
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
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl16.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl16.copy();
        double[] doubleArray22 = bigMatrixImpl16.getColumnAsDoubleArray((int) (short) 1);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl16.getDataRef();
        int int24 = bigMatrixImpl16.getRowDimension();
        int int25 = bigMatrixImpl16.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = bigMatrixImpl16.getColumnAsDoubleArray(10);
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
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
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
        java.lang.String str35 = bigMatrixImpl33.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl33.inverse();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "BigMatrixImpl{{400},{400}}" + "'", str35, "BigMatrixImpl{{400},{400}}");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl13.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl27);
        int int30 = bigMatrixImpl13.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl13.getData();
        int int32 = bigMatrixImpl13.getRowDimension();
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
        org.junit.Assert.assertNotNull(bigDecimalArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        bigMatrixImpl34.setScale(0);
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl34.getNorm();
        int int39 = bigMatrixImpl34.getColumnDimension();
        java.lang.Class<?> wildcardClass40 = bigMatrixImpl34.getClass();
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
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "BigMatrixImpl{}", "", "hi!", "BigMatrixImpl{{400},{400}}", "BigMatrixImpl{}" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "BigMatrixImpl{}", "", "hi!", "BigMatrixImpl{{400},{400}}", "BigMatrixImpl{}" };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "BigMatrixImpl{}", "", "hi!", "BigMatrixImpl{{400},{400}}", "BigMatrixImpl{}" };
        java.lang.String[] strArray27 = new java.lang.String[] { "", "BigMatrixImpl{}", "", "hi!", "BigMatrixImpl{{400},{400}}", "BigMatrixImpl{}" };
        java.lang.String[][] strArray28 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(strArray28);
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray8 = bigMatrixImpl0.getDataRef();
        java.lang.String str9 = bigMatrixImpl0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BigMatrixImpl{}" + "'", str3, "BigMatrixImpl{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNull(bigDecimalArray5);
        org.junit.Assert.assertNull(bigDecimalArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(bigDecimalArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "BigMatrixImpl{}" + "'", str9, "BigMatrixImpl{}");
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
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        boolean boolean20 = bigMatrixImpl19.isSingular();
        double[][] doubleArray21 = bigMatrixImpl19.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray25 = bigMatrixImpl23.getColumn((int) (short) 10);
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
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
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
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        int int15 = bigMatrixImpl13.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.transpose();
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        boolean boolean32 = bigMatrixImpl13.equals((java.lang.Object) bigDecimal31);
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[][] doubleArray45 = new double[][] { doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl46.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl46.copy();
        boolean boolean49 = bigMatrixImpl46.isSquare();
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[] doubleArray55 = new double[] { (short) 10, 100L };
        double[] doubleArray58 = new double[] { (short) 10, 100L };
        double[] doubleArray61 = new double[] { (short) 10, 100L };
        double[][] doubleArray62 = new double[][] { doubleArray52, doubleArray55, doubleArray58, doubleArray61 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray62);
        java.math.BigDecimal[][] bigDecimalArray64 = bigMatrixImpl63.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64);
        java.math.BigDecimal bigDecimal66 = bigMatrixImpl65.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = bigMatrixImpl46.scalarAdd(bigDecimal66);
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl13.scalarMultiply(bigDecimal66);
        int int69 = bigMatrixImpl13.getColumnDimension();
        boolean boolean70 = bigMatrixImpl13.isSingular();
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(bigDecimalArray47);
        org.junit.Assert.assertNotNull(bigMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
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
        org.junit.Assert.assertNotNull(bigMatrix67);
        org.junit.Assert.assertNotNull(bigMatrix68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', 97);
        bigMatrixImpl2.setRoundingMode((int) (short) 10);
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
        int int53 = bigMatrixImpl51.getRoundingMode();
        double[] doubleArray56 = new double[] { (short) 10, 100L };
        double[] doubleArray59 = new double[] { (short) 10, 100L };
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[] doubleArray65 = new double[] { (short) 10, 100L };
        double[][] doubleArray66 = new double[][] { doubleArray56, doubleArray59, doubleArray62, doubleArray65 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray66);
        java.math.BigDecimal[][] bigDecimalArray68 = bigMatrixImpl67.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray68);
        java.math.BigDecimal bigDecimal70 = bigMatrixImpl69.getNorm();
        java.math.BigDecimal[][] bigDecimalArray71 = bigMatrixImpl69.getDataRef();
        double[] doubleArray74 = new double[] { (short) 10, 100L };
        double[] doubleArray77 = new double[] { (short) 10, 100L };
        double[] doubleArray80 = new double[] { (short) 10, 100L };
        double[] doubleArray83 = new double[] { (short) 10, 100L };
        double[][] doubleArray84 = new double[][] { doubleArray74, doubleArray77, doubleArray80, doubleArray83 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray84);
        java.math.BigDecimal[][] bigDecimalArray86 = bigMatrixImpl85.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl87 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray86);
        java.math.BigDecimal bigDecimal88 = bigMatrixImpl87.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix89 = bigMatrixImpl69.scalarMultiply(bigDecimal88);
        org.apache.commons.math.linear.BigMatrix bigMatrix90 = bigMatrixImpl51.scalarAdd(bigDecimal88);
        int int91 = bigMatrixImpl51.getScale();
        int int92 = bigMatrixImpl51.getColumnDimension();
        double[] doubleArray94 = bigMatrixImpl51.getRowAsDoubleArray(2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix99 = bigMatrixImpl51.getSubMatrix((int) (short) -1, 10, 10, 64);
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertNotNull(bigDecimalArray68);
        org.junit.Assert.assertNotNull(bigDecimal70);
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
        org.junit.Assert.assertNotNull(bigMatrix89);
        org.junit.Assert.assertNotNull(bigMatrix90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 64 + "'", int91 == 64);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 2 + "'", int92 == 2);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[10.0, 100.0]");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) '4', (int) ' ');
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl16.getNorm();
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        java.math.BigDecimal[] bigDecimalArray35 = new java.math.BigDecimal[] { bigDecimal17, bigDecimal34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray41 = bigMatrixImpl2.preMultiply(bigDecimalArray35);
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
        org.junit.Assert.assertNotNull(bigDecimal17);
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
    }
}

