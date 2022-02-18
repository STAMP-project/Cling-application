import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray4 = bigDecimal1.divideAndRemainder(bigDecimal3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl5.copy();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(0.0d);
        java.lang.String str9 = bigDecimal8.toString();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal12 = bigDecimal11.stripTrailingZeros();
        int int13 = bigDecimal11.signum();
        java.math.BigDecimal[] bigDecimalArray14 = bigDecimal8.divideAndRemainder(bigDecimal11);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        int int16 = bigMatrixImpl15.getRoundingMode();
        boolean boolean17 = bigMatrixImpl15.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = bigMatrix6.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl15);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrix6.copy();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bigMatrix6.getEntryAsDouble((int) (short) 9, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimalArray4);
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        boolean boolean14 = bigMatrix13.isSingular();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrix13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) '4');
        java.math.BigDecimal bigDecimal4 = bigDecimal1.setScale(64, 4);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl3.getData();
        int int5 = bigMatrixImpl3.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl3.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl3.getRowMatrix(0);
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrix8.getData();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(bigDecimalArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(bigDecimalArray6);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigDecimalArray9);
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger2 = bigDecimal1.unscaledValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.stripTrailingZeros();
        int int4 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.setScale((int) '4');
        java.math.MathContext mathContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) (short) 7888, mathContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(bigDecimal6);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        double[] doubleArray10 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray10);
        double[] doubleArray12 = realMatrix5.operate(doubleArray10);
        double[] doubleArray17 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrix19.scalarAdd((double) 6);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrix5.multiply(realMatrix19);
        boolean boolean23 = realMatrix22.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrix22.scalarMultiply((double) 'a');
        double[] doubleArray32 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray39 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray46 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray53 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[][] doubleArray54 = new double[][] { doubleArray32, doubleArray39, doubleArray46, doubleArray53 };
        org.apache.commons.math.linear.RealMatrix realMatrix55 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray54);
        double[][] doubleArray56 = realMatrix55.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray56);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrix25.preMultiply(realMatrix57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[2805.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(realMatrix57);
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        double[] doubleArray10 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray10);
        double[] doubleArray12 = realMatrix5.operate(doubleArray10);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrix14.transpose();
        double[][] doubleArray16 = realMatrix14.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray16);
        int int18 = realMatrix17.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrix17.getRowMatrix((int) (byte) 11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[2805.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl14.getDataRef();
        bigMatrixImpl14.setScale((int) (short) 100);
        boolean boolean20 = bigMatrixImpl14.isSingular();
        double[][] doubleArray21 = bigMatrixImpl14.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray21);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf(0L, (-32));
        java.math.BigDecimal bigDecimal3 = bigDecimal2.ulp();
        long long4 = bigDecimal2.longValue();
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(0.0d);
        int int7 = bigDecimal6.intValue();
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal6.min(bigDecimal9);
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal11 };
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(0.0d);
        int int15 = bigDecimal14.intValue();
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal19 = bigDecimal14.min(bigDecimal17);
        java.math.BigDecimal[] bigDecimalArray20 = new java.math.BigDecimal[] { bigDecimal19 };
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(0.0d);
        int int23 = bigDecimal22.intValue();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(0.0d);
        int int26 = bigDecimal25.intValue();
        java.math.BigDecimal bigDecimal27 = bigDecimal22.min(bigDecimal25);
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal27 };
        java.math.BigDecimal[][] bigDecimalArray29 = new java.math.BigDecimal[][] { bigDecimalArray12, bigDecimalArray20, bigDecimalArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray29);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getDataRef();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal36 = bigDecimal35.stripTrailingZeros();
        float float37 = bigDecimal35.floatValue();
        java.math.BigDecimal bigDecimal38 = bigDecimal35.ulp();
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal(0.0d);
        java.lang.String str41 = bigDecimal40.toString();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = bigDecimal43.stripTrailingZeros();
        int int45 = bigDecimal43.signum();
        java.math.BigDecimal[] bigDecimalArray46 = bigDecimal40.divideAndRemainder(bigDecimal43);
        java.math.BigDecimal bigDecimal48 = bigDecimal40.pow((int) 'a');
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        java.lang.String str51 = bigDecimal50.toString();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        int int55 = bigDecimal53.signum();
        java.math.BigDecimal[] bigDecimalArray56 = bigDecimal50.divideAndRemainder(bigDecimal53);
        java.math.BigDecimal bigDecimal58 = bigDecimal50.pow((int) 'a');
        java.math.BigInteger bigInteger59 = bigDecimal50.toBigIntegerExact();
        java.math.BigDecimal bigDecimal60 = bigDecimal48.add(bigDecimal50);
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal63 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger64 = bigDecimal63.unscaledValue();
        java.math.BigDecimal bigDecimal65 = bigDecimal61.add(bigDecimal63);
        java.math.BigDecimal bigDecimal66 = bigDecimal50.multiply(bigDecimal61);
        java.math.BigDecimal bigDecimal67 = bigDecimal38.divide(bigDecimal61);
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl32.scalarAdd(bigDecimal67);
        java.math.BigDecimal bigDecimal69 = bigDecimal2.min(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimalArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(bigDecimalArray33);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 97.0f + "'", float37 == 97.0f);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0" + "'", str51, "0");
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray56);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigMatrix68);
        org.junit.Assert.assertNotNull(bigDecimal69);
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        double[] doubleArray10 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray10);
        double[] doubleArray12 = realMatrix5.operate(doubleArray10);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrix14.transpose();
        double[][] doubleArray16 = realMatrix14.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        int int18 = bigMatrixImpl17.getRoundingMode();
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl17.getNorm();
        boolean boolean20 = bigMatrixImpl17.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = bigMatrixImpl17.getColumnAsDoubleArray((int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[2805.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 97);
        double double2 = realMatrix1.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix3 = realMatrix1.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrix1.getRowMatrix((int) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrix5.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrix6.scalarAdd((double) (-54.0f));
        double[] doubleArray13 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray13);
        double[] doubleArray19 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray19);
        double[] doubleArray21 = realMatrix14.operate(doubleArray19);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray21);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrix24.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrix26.transpose();
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(0.0d);
        java.lang.String str30 = bigDecimal29.toString();
        java.math.BigDecimal bigDecimal32 = bigDecimal29.setScale(0);
        double[] doubleArray37 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix38 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrix39.scalarAdd((double) 6);
        int int42 = realMatrix39.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrix39.scalarAdd(10.0d);
        double[] doubleArray49 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix50 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray49);
        double double51 = realMatrix50.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrix50.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrix44.preMultiply(realMatrix53);
        boolean boolean55 = bigDecimal32.equals((java.lang.Object) realMatrix44);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrix44.transpose();
        double[] doubleArray58 = realMatrix44.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrix44.transpose();
        int int60 = realMatrix59.getColumnDimension();
        double[] doubleArray65 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix66 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray65);
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray65);
        double[] doubleArray73 = realMatrix59.operate(doubleArray65);
        double[] doubleArray74 = realMatrix26.preMultiply(doubleArray73);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray75 = realMatrix6.solve(doubleArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[2805.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 52.0d + "'", double51 == 52.0d);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[62.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(bigMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[3415.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[9575660.0]");
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        bigMatrixImpl27.setRoundingMode((int) '4');
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(0.0d);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(0.0d);
        int int36 = bigDecimal35.intValue();
        java.math.BigDecimal bigDecimal37 = bigDecimal32.min(bigDecimal35);
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal37 };
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal(0.0d);
        int int41 = bigDecimal40.intValue();
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        java.math.BigDecimal bigDecimal45 = bigDecimal40.min(bigDecimal43);
        java.math.BigDecimal[] bigDecimalArray46 = new java.math.BigDecimal[] { bigDecimal45 };
        java.math.BigDecimal bigDecimal48 = new java.math.BigDecimal(0.0d);
        int int49 = bigDecimal48.intValue();
        java.math.BigDecimal bigDecimal51 = new java.math.BigDecimal(0.0d);
        int int52 = bigDecimal51.intValue();
        java.math.BigDecimal bigDecimal53 = bigDecimal48.min(bigDecimal51);
        java.math.BigDecimal[] bigDecimalArray54 = new java.math.BigDecimal[] { bigDecimal53 };
        java.math.BigDecimal[][] bigDecimalArray55 = new java.math.BigDecimal[][] { bigDecimalArray38, bigDecimalArray46, bigDecimalArray54 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        org.apache.commons.math.linear.BigMatrix bigMatrix57 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray55);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl58.getDataRef();
        java.math.BigDecimal bigDecimal60 = bigMatrixImpl58.getNorm();
        boolean boolean61 = bigMatrixImpl58.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl58.copy();
        double[] doubleArray64 = bigMatrixImpl58.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray66 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray67 = new java.lang.String[][] { strArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(strArray67);
        org.apache.commons.math.linear.BigMatrix bigMatrix69 = bigMatrixImpl58.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl68);
        java.math.BigDecimal bigDecimal70 = bigMatrixImpl58.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix71 = bigMatrixImpl27.scalarAdd(bigDecimal70);
        boolean boolean72 = bigMatrixImpl27.isSingular();
        boolean boolean73 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix74 = bigMatrixImpl27.copy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimalArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimalArray54);
        org.junit.Assert.assertNotNull(bigDecimalArray55);
        org.junit.Assert.assertNotNull(bigMatrix57);
        org.junit.Assert.assertNotNull(bigDecimalArray59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(bigMatrix62);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(bigMatrix69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigMatrix71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(bigMatrix74);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 97);
        double[] doubleArray3 = realMatrix1.getColumn(4);
        double[][] doubleArray4 = realMatrix1.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrix1.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrix1.transpose();
        boolean boolean7 = realMatrix6.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrix6.inverse();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrix6.scalarAdd((-272085.0d));
        int int11 = realMatrix10.getColumnDimension();
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = realMatrix10.preMultiply(doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        boolean boolean16 = bigMatrixImpl14.isSingular();
        java.lang.String str17 = bigMatrixImpl14.toString();
        int int18 = bigMatrixImpl14.getScale();
        int[] intArray25 = new int[] { 98, (byte) 85, (byte) 100, (-2), (byte) 11, (short) -3072 };
        int[] intArray29 = new int[] { 35, (short) -2805, 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl14.getSubMatrix(intArray25, intArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "BigMatrixImpl{{1,100},{1,100},{1,100},{1,100}}" + "'", str17, "BigMatrixImpl{{1,100},{1,100},{1,100},{1,100}}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[98, 85, 100, -2, 11, -3072]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, -2805, 2]");
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("100");
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal2.precision();
        float float4 = bigDecimal2.floatValue();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl8 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray7);
        java.math.BigDecimal bigDecimal9 = bigMatrixImpl8.getNorm();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(0.0d);
        int int16 = bigDecimal15.intValue();
        java.math.BigDecimal bigDecimal17 = bigDecimal12.min(bigDecimal15);
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal17 };
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        int int24 = bigDecimal23.intValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal20.min(bigDecimal23);
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal25 };
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d);
        int int29 = bigDecimal28.intValue();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.min(bigDecimal31);
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal33 };
        java.math.BigDecimal[][] bigDecimalArray35 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray26, bigDecimalArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getDataRef();
        java.math.BigDecimal bigDecimal40 = bigMatrixImpl38.getNorm();
        boolean boolean41 = bigMatrixImpl38.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl38.copy();
        double[] doubleArray44 = bigMatrixImpl38.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray46 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray47 = new java.lang.String[][] { strArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(strArray47);
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl38.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl48);
        java.math.BigDecimal bigDecimal50 = bigMatrixImpl38.getNorm();
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl38.getData();
        int int52 = bigMatrixImpl38.getScale();
        boolean boolean53 = bigDecimal10.equals((java.lang.Object) bigMatrixImpl38);
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = bigMatrixImpl8.scalarMultiply(bigDecimal10);
        java.math.BigDecimal[] bigDecimalArray56 = bigMatrixImpl8.getRow(1);
        org.apache.commons.math.linear.BigMatrix bigMatrix57 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray56);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56);
        double[][] doubleArray59 = bigMatrixImpl58.getDataAsDoubleArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray61 = bigMatrixImpl58.getRow((int) (short) -3072);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimalArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimalArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimalArray34);
        org.junit.Assert.assertNotNull(bigDecimalArray35);
        org.junit.Assert.assertNotNull(bigMatrix37);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bigMatrix42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(bigMatrix49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 64 + "'", int52 == 64);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(bigMatrix54);
        org.junit.Assert.assertNotNull(bigDecimalArray56);
        org.junit.Assert.assertNotNull(bigMatrix57);
        org.junit.Assert.assertNotNull(doubleArray59);
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        double[] doubleArray1 = new double[] { 8667.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix2 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray1);
        double[] doubleArray7 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray7);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray7);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrix9.scalarAdd((double) 6);
        int int12 = realMatrix9.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrix9.scalarAdd(10.0d);
        double[] doubleArray19 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix20 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray19);
        double double21 = realMatrix20.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrix20.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrix14.preMultiply(realMatrix23);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrix24.scalarAdd((double) 1.0f);
        double[] doubleArray31 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrix33.scalarAdd((double) 6);
        int int36 = realMatrix33.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrix33.scalarAdd(10.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrix26.preMultiply(realMatrix33);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrix26.copy();
        boolean boolean41 = realMatrix40.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrix40.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrix2.multiply(realMatrix40);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrix2.copy();
        double[] doubleArray49 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix50 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray49);
        double[] doubleArray55 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix56 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray55);
        double[] doubleArray57 = realMatrix50.operate(doubleArray55);
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray55);
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrix61.scalarAdd(1.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrix61.scalarMultiply((double) 100.0f);
        int int66 = realMatrix61.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrix44.preMultiply(realMatrix61);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrix61.scalarMultiply((-3.5650623885918E-4d));
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrix69.scalarAdd((double) 1000.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[8667.0]");
        org.junit.Assert.assertNotNull(realMatrix2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[2805.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(bigMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix71);
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal19 = bigDecimal18.stripTrailingZeros();
        int int20 = bigDecimal18.signum();
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl14.scalarMultiply(bigDecimal18);
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl14.getNorm();
        java.math.BigInteger bigInteger23 = bigDecimal22.toBigIntegerExact();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger23);
        double[] doubleArray27 = new double[] { 1.0d, 100.0f };
        double[] doubleArray30 = new double[] { 1.0d, 100.0f };
        double[] doubleArray33 = new double[] { 1.0d, 100.0f };
        double[] doubleArray36 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray37);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl39.transpose();
        double[] doubleArray42 = bigMatrixImpl39.getRowAsDoubleArray((int) (short) 0);
        boolean boolean43 = bigMatrixImpl39.isSingular();
        java.math.BigDecimal[][] bigDecimalArray44 = bigMatrixImpl39.getData();
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl39.getDataRef();
        int int46 = bigMatrixImpl39.getRoundingMode();
        bigMatrixImpl39.setRoundingMode((int) (short) -100);
        double[] doubleArray51 = new double[] { 1.0d, 100.0f };
        double[] doubleArray54 = new double[] { 1.0d, 100.0f };
        double[] doubleArray57 = new double[] { 1.0d, 100.0f };
        double[] doubleArray60 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray61 = new double[][] { doubleArray51, doubleArray54, doubleArray57, doubleArray60 };
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray61);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl63.transpose();
        boolean boolean65 = bigMatrixImpl63.isSingular();
        int int66 = bigMatrixImpl63.getRoundingMode();
        double[][] doubleArray67 = bigMatrixImpl63.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl39.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl63);
        java.math.BigDecimal bigDecimal69 = bigMatrixImpl39.getNorm();
        int int70 = bigDecimal69.intValue();
        java.math.BigDecimal bigDecimal71 = bigDecimal24.max(bigDecimal69);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(bigMatrix21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(bigMatrix38);
        org.junit.Assert.assertNotNull(bigMatrix40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray44);
        org.junit.Assert.assertNotNull(bigDecimalArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertNotNull(bigMatrix62);
        org.junit.Assert.assertNotNull(bigMatrix64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(bigMatrix68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 400 + "'", int70 == 400);
        org.junit.Assert.assertNotNull(bigDecimal71);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl6 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl11 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        int int12 = bigMatrixImpl11.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray13 = bigMatrixImpl11.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(1);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrix15.inverse();
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrix16.copy();
        java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(0.0d);
        int int20 = bigDecimal19.intValue();
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(0.0d);
        int int23 = bigDecimal22.intValue();
        java.math.BigDecimal bigDecimal24 = bigDecimal19.min(bigDecimal22);
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal24 };
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(0.0d);
        int int28 = bigDecimal27.intValue();
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(0.0d);
        int int31 = bigDecimal30.intValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal27.min(bigDecimal30);
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal32 };
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(0.0d);
        int int36 = bigDecimal35.intValue();
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(0.0d);
        int int39 = bigDecimal38.intValue();
        java.math.BigDecimal bigDecimal40 = bigDecimal35.min(bigDecimal38);
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal40 };
        java.math.BigDecimal[][] bigDecimalArray42 = new java.math.BigDecimal[][] { bigDecimalArray25, bigDecimalArray33, bigDecimalArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl45.getDataRef();
        java.math.BigDecimal bigDecimal47 = bigMatrixImpl45.getNorm();
        boolean boolean48 = bigMatrixImpl45.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl45.copy();
        double[] doubleArray51 = bigMatrixImpl45.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray53 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray54 = new java.lang.String[][] { strArray53 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(strArray54);
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl45.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl55);
        java.math.BigDecimal bigDecimal58 = new java.math.BigDecimal(0.0d);
        java.lang.String str59 = bigDecimal58.toString();
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal62 = bigDecimal61.stripTrailingZeros();
        int int63 = bigDecimal61.signum();
        java.math.BigDecimal[] bigDecimalArray64 = bigDecimal58.divideAndRemainder(bigDecimal61);
        java.math.BigDecimal bigDecimal66 = bigDecimal58.pow((int) 'a');
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(0.0d);
        java.lang.String str69 = bigDecimal68.toString();
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal72 = bigDecimal71.stripTrailingZeros();
        int int73 = bigDecimal71.signum();
        java.math.BigDecimal[] bigDecimalArray74 = bigDecimal68.divideAndRemainder(bigDecimal71);
        java.math.BigDecimal bigDecimal76 = bigDecimal68.pow((int) 'a');
        java.math.BigInteger bigInteger77 = bigDecimal68.toBigIntegerExact();
        java.math.BigDecimal bigDecimal78 = bigDecimal66.add(bigDecimal68);
        java.math.BigInteger bigInteger79 = bigDecimal78.unscaledValue();
        java.math.BigInteger bigInteger80 = bigDecimal78.toBigIntegerExact();
        boolean boolean81 = bigMatrixImpl45.equals((java.lang.Object) bigInteger80);
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl45.copy();
        java.math.BigDecimal[] bigDecimalArray84 = bigMatrixImpl45.getRow((int) (byte) 1);
        java.math.BigDecimal[] bigDecimalArray85 = bigMatrix16.operate(bigDecimalArray84);
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray84);
        org.apache.commons.math.linear.BigMatrix bigMatrix87 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray84);
        org.apache.commons.math.linear.BigMatrix bigMatrix88 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray84);
        java.math.BigDecimal[] bigDecimalArray89 = bigMatrixImpl11.preMultiply(bigDecimalArray84);
        org.apache.commons.math.linear.BigMatrix bigMatrix90 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray84);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimalArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimalArray41);
        org.junit.Assert.assertNotNull(bigDecimalArray42);
        org.junit.Assert.assertNotNull(bigMatrix44);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bigMatrix49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(bigMatrix56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0" + "'", str59, "0");
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray64);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray74);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(bigMatrix82);
        org.junit.Assert.assertNotNull(bigDecimalArray84);
        org.junit.Assert.assertNotNull(bigDecimalArray85);
        org.junit.Assert.assertNotNull(bigMatrix86);
        org.junit.Assert.assertNotNull(bigMatrix87);
        org.junit.Assert.assertNotNull(bigMatrix88);
        org.junit.Assert.assertNotNull(bigDecimalArray89);
        org.junit.Assert.assertNotNull(bigMatrix90);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        boolean boolean14 = bigMatrix13.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrix13.copy();
        java.math.BigDecimal bigDecimal16 = bigMatrix13.getNorm();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        double[] doubleArray20 = new double[] { 1.0d, 100.0f };
        double[] doubleArray23 = new double[] { 1.0d, 100.0f };
        double[] doubleArray26 = new double[] { 1.0d, 100.0f };
        double[] doubleArray29 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray30);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl32.transpose();
        double[] doubleArray35 = bigMatrixImpl32.getRowAsDoubleArray((int) (short) 0);
        boolean boolean36 = bigMatrixImpl32.isSingular();
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl32.getData();
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl32.getNorm();
        double[] doubleArray41 = new double[] { 1.0d, 100.0f };
        double[] doubleArray44 = new double[] { 1.0d, 100.0f };
        double[] doubleArray47 = new double[] { 1.0d, 100.0f };
        double[] doubleArray50 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray51 = new double[][] { doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray51);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray51);
        boolean boolean55 = bigDecimal38.equals((java.lang.Object) doubleArray51);
        java.math.BigDecimal bigDecimal57 = bigDecimal16.divide(bigDecimal38, (int) (short) 1);
        java.lang.String str58 = bigDecimal16.toPlainString();
        short short59 = bigDecimal16.shortValueExact();
        short short60 = bigDecimal16.shortValue();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(bigMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(bigMatrix52);
        org.junit.Assert.assertNotNull(bigMatrix54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "400" + "'", str58, "400");
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 400 + "'", short59 == (short) 400);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 400 + "'", short60 == (short) 400);
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl6 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl11 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal13.min(bigDecimal16);
        java.math.BigDecimal[] bigDecimalArray19 = new java.math.BigDecimal[] { bigDecimal18 };
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(0.0d);
        int int25 = bigDecimal24.intValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal21.min(bigDecimal24);
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal26 };
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(0.0d);
        int int30 = bigDecimal29.intValue();
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(0.0d);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal29.min(bigDecimal32);
        java.math.BigDecimal[] bigDecimalArray35 = new java.math.BigDecimal[] { bigDecimal34 };
        java.math.BigDecimal[][] bigDecimalArray36 = new java.math.BigDecimal[][] { bigDecimalArray19, bigDecimalArray27, bigDecimalArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        java.math.BigDecimal bigDecimal41 = bigMatrixImpl39.getNorm();
        boolean boolean42 = bigMatrixImpl39.isSquare();
        java.math.BigDecimal[][] bigDecimalArray43 = bigMatrixImpl39.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = bigMatrixImpl39.transpose();
        bigMatrixImpl39.setRoundingMode(7);
        boolean boolean47 = bigMatrixImpl39.isSingular();
        int int48 = bigMatrixImpl39.getRowDimension();
        boolean boolean49 = bigMatrixImpl39.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl11.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl39);
        boolean boolean51 = bigMatrixImpl39.isSquare();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(bigMatrix9);
        org.junit.Assert.assertNotNull(bigMatrix10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimalArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimalArray35);
        org.junit.Assert.assertNotNull(bigDecimalArray36);
        org.junit.Assert.assertNotNull(bigMatrix38);
        org.junit.Assert.assertNotNull(bigDecimalArray40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray43);
        org.junit.Assert.assertNotNull(bigMatrix44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(bigMatrix50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl27.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl27.transpose();
        bigMatrixImpl27.setRoundingMode(7);
        boolean boolean35 = bigMatrixImpl27.isSingular();
        double[][] doubleArray36 = bigMatrixImpl27.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = bigMatrixImpl27.copy();
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl27.getData();
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl27.getData();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray31);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(bigMatrix37);
        org.junit.Assert.assertNotNull(bigDecimalArray38);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal23 = bigDecimal18.min(bigDecimal21);
        java.math.BigInteger bigInteger24 = bigDecimal18.toBigInteger();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrix16.scalarAdd(bigDecimal25);
        java.math.BigDecimal bigDecimal27 = bigMatrix26.getNorm();
        double[] doubleArray30 = new double[] { 1.0d, 100.0f };
        double[] doubleArray33 = new double[] { 1.0d, 100.0f };
        double[] doubleArray36 = new double[] { 1.0d, 100.0f };
        double[] doubleArray39 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray40 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39 };
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray40);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl42.transpose();
        double[] doubleArray45 = bigMatrixImpl42.getRowAsDoubleArray((int) (short) 0);
        boolean boolean46 = bigMatrixImpl42.isSingular();
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl42.getData();
        int int48 = bigMatrixImpl42.getRoundingMode();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal52 = new java.math.BigDecimal(0.0d);
        java.lang.String str53 = bigDecimal52.toString();
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal56 = bigDecimal55.stripTrailingZeros();
        int int57 = bigDecimal55.signum();
        java.math.BigDecimal[] bigDecimalArray58 = bigDecimal52.divideAndRemainder(bigDecimal55);
        java.math.BigDecimal bigDecimal60 = bigDecimal52.pow((int) 'a');
        java.math.BigDecimal[] bigDecimalArray61 = new java.math.BigDecimal[] { bigDecimal50, bigDecimal52 };
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray61);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrix62.getColumnMatrix(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix65 = bigMatrixImpl42.multiply(bigMatrix62);
        java.math.BigDecimal bigDecimal66 = bigMatrixImpl42.getNorm();
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(0.0d);
        int int69 = bigDecimal68.intValue();
        long long70 = bigDecimal68.longValue();
        long long71 = bigDecimal68.longValueExact();
        int int72 = bigDecimal68.precision();
        java.math.BigDecimal bigDecimal74 = new java.math.BigDecimal(0.0d);
        int int75 = bigDecimal74.intValue();
        long long76 = bigDecimal74.longValue();
        long long77 = bigDecimal74.longValueExact();
        java.math.BigDecimal bigDecimal78 = bigDecimal68.add(bigDecimal74);
        java.math.BigDecimal bigDecimal80 = new java.math.BigDecimal(0.0d);
        int int81 = bigDecimal80.intValue();
        java.math.BigDecimal bigDecimal83 = new java.math.BigDecimal(0.0d);
        int int84 = bigDecimal83.intValue();
        java.math.BigDecimal bigDecimal85 = bigDecimal80.min(bigDecimal83);
        java.math.BigDecimal bigDecimal86 = bigDecimal78.min(bigDecimal83);
        java.math.BigInteger bigInteger87 = bigDecimal86.toBigInteger();
        org.apache.commons.math.linear.BigMatrix bigMatrix88 = bigMatrixImpl42.scalarMultiply(bigDecimal86);
        java.math.BigDecimal bigDecimal89 = bigDecimal27.max(bigDecimal86);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(bigMatrix41);
        org.junit.Assert.assertNotNull(bigMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray58);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimalArray61);
        org.junit.Assert.assertNotNull(bigMatrix62);
        org.junit.Assert.assertNotNull(bigMatrix64);
        org.junit.Assert.assertNotNull(bigMatrix65);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(bigDecimal85);
        org.junit.Assert.assertNotNull(bigDecimal86);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigMatrix88);
        org.junit.Assert.assertNotNull(bigDecimal89);
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        java.math.BigDecimal bigDecimal30 = bigMatrixImpl29.getNorm();
        double[][] doubleArray31 = bigMatrixImpl29.getDataAsDoubleArray();
        bigMatrixImpl29.setRoundingMode((int) (short) 35);
        int int34 = bigMatrixImpl29.getRoundingMode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        boolean boolean16 = bigMatrixImpl14.isSingular();
        double[] doubleArray18 = bigMatrixImpl14.getColumnAsDoubleArray(0);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray18);
        double double20 = realMatrix19.getNorm();
        int int21 = realMatrix19.getColumnDimension();
        int int22 = realMatrix19.getRowDimension();
        double[][] doubleArray23 = realMatrix19.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        double[] doubleArray17 = bigMatrixImpl14.getRowAsDoubleArray((int) (short) 0);
        int int18 = bigMatrixImpl14.getRowDimension();
        int int19 = bigMatrixImpl14.getRowDimension();
        java.math.BigDecimal[] bigDecimalArray21 = bigMatrixImpl14.getColumn(0);
        bigMatrixImpl14.setRoundingMode((int) (byte) -112);
        int[] intArray30 = new int[] { (short) 388, (short) 1, (short) 35, '#', (short) -2805, (short) 7888 };
        int[] intArray32 = new int[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl14.getSubMatrix(intArray30, intArray32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(bigDecimalArray21);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[388, 1, 35, 35, -2805, 7888]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1]");
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal("BigMatrixImpl{{-1,52,10,0}}", mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 1);
        double[] doubleArray6 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix7 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrix8.scalarAdd((double) 6);
        int int11 = realMatrix8.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrix8.scalarAdd(10.0d);
        double[] doubleArray18 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix19 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray18);
        double double20 = realMatrix19.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrix19.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrix13.preMultiply(realMatrix22);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrix23.scalarAdd((double) 1.0f);
        double[] doubleArray30 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix31 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrix32.scalarAdd((double) 6);
        int int35 = realMatrix32.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrix32.scalarAdd(10.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrix25.preMultiply(realMatrix32);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrix25.copy();
        boolean boolean40 = realMatrix39.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrix39.transpose();
        double[] doubleArray46 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix47 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrix48.scalarAdd((double) 6);
        int int51 = realMatrix50.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrix50.scalarMultiply(1.0d);
        double[] doubleArray55 = realMatrix50.getRow(3);
        double[] doubleArray56 = realMatrix39.operate(doubleArray55);
        org.apache.commons.math.linear.BigMatrix bigMatrix57 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray55);
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray55);
        boolean boolean59 = bigDecimal1.equals((java.lang.Object) bigMatrix58);
        double[] doubleArray62 = new double[] { 1.0d, 100.0f };
        double[] doubleArray65 = new double[] { 1.0d, 100.0f };
        double[] doubleArray68 = new double[] { 1.0d, 100.0f };
        double[] doubleArray71 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray72 = new double[][] { doubleArray62, doubleArray65, doubleArray68, doubleArray71 };
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray72);
        boolean boolean74 = bigMatrix73.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrix73.transpose();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.valueOf((double) 0L);
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = bigMatrix75.scalarAdd(bigDecimal77);
        java.math.BigInteger bigInteger79 = bigDecimal77.unscaledValue();
        java.math.BigDecimal bigDecimal81 = new java.math.BigDecimal(bigInteger79, (int) (short) 10);
        java.math.BigDecimal bigDecimal82 = bigDecimal1.multiply(bigDecimal81);
        java.math.BigDecimal bigDecimal85 = java.math.BigDecimal.valueOf((long) (short) 100, 0);
        short short86 = bigDecimal85.shortValueExact();
        java.math.BigDecimal bigDecimal87 = bigDecimal85.ulp();
        java.math.MathContext mathContext88 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray89 = bigDecimal1.divideAndRemainder(bigDecimal87, mathContext88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[6.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[52008.0]");
        org.junit.Assert.assertNotNull(bigMatrix57);
        org.junit.Assert.assertNotNull(bigMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertNotNull(bigMatrix73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(bigMatrix75);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigMatrix78);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigDecimal82);
        org.junit.Assert.assertNotNull(bigDecimal85);
        org.junit.Assert.assertTrue("'" + short86 + "' != '" + (short) 100 + "'", short86 == (short) 100);
        org.junit.Assert.assertNotNull(bigDecimal87);
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl14.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = bigMatrixImpl14.copy();
        double[][] doubleArray19 = bigMatrixImpl14.getDataAsDoubleArray();
        java.math.BigDecimal bigDecimal20 = bigMatrixImpl14.getNorm();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray25 = bigDecimal22.divideAndRemainder(bigDecimal24);
        java.math.BigDecimal bigDecimal27 = bigDecimal24.movePointLeft((-1));
        java.math.BigDecimal bigDecimal28 = bigDecimal20.divideToIntegralValue(bigDecimal24);
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(0.0d);
        int int31 = bigDecimal30.intValue();
        java.math.BigDecimal bigDecimal33 = new java.math.BigDecimal(0.0d);
        int int34 = bigDecimal33.intValue();
        java.math.BigDecimal bigDecimal35 = bigDecimal30.min(bigDecimal33);
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal35 };
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(0.0d);
        int int39 = bigDecimal38.intValue();
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal(0.0d);
        int int42 = bigDecimal41.intValue();
        java.math.BigDecimal bigDecimal43 = bigDecimal38.min(bigDecimal41);
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal43 };
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal(0.0d);
        int int47 = bigDecimal46.intValue();
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(0.0d);
        int int50 = bigDecimal49.intValue();
        java.math.BigDecimal bigDecimal51 = bigDecimal46.min(bigDecimal49);
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal51 };
        java.math.BigDecimal[][] bigDecimalArray53 = new java.math.BigDecimal[][] { bigDecimalArray36, bigDecimalArray44, bigDecimalArray52 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray53);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        java.math.BigDecimal[][] bigDecimalArray57 = bigMatrixImpl56.getDataRef();
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl56.getNorm();
        boolean boolean59 = bigMatrixImpl56.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = bigMatrixImpl56.copy();
        double[] doubleArray62 = bigMatrixImpl56.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal63 = java.math.BigDecimal.TEN;
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl56.scalarMultiply(bigDecimal63);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl56.scalarAdd(bigDecimal67);
        java.math.BigDecimal bigDecimal70 = bigDecimal67.movePointLeft((int) (short) -100);
        java.math.BigDecimal bigDecimal72 = new java.math.BigDecimal(0.0d);
        int int73 = bigDecimal72.intValue();
        long long74 = bigDecimal72.longValue();
        java.math.BigDecimal bigDecimal75 = bigDecimal67.min(bigDecimal72);
        java.math.BigDecimal bigDecimal76 = bigDecimal67.plus();
        java.math.BigDecimal bigDecimal77 = bigDecimal28.divideToIntegralValue(bigDecimal76);
        java.math.BigInteger bigInteger78 = bigDecimal76.toBigInteger();
        java.math.BigDecimal bigDecimal80 = java.math.BigDecimal.valueOf((long) (byte) 97);
        int int81 = bigDecimal80.intValueExact();
        java.math.BigDecimal bigDecimal84 = bigDecimal80.setScale(0, (int) (short) 0);
        java.math.BigDecimal[] bigDecimalArray85 = bigDecimal76.divideAndRemainder(bigDecimal80);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimalArray25);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimalArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimalArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertNotNull(bigDecimalArray53);
        org.junit.Assert.assertNotNull(bigMatrix55);
        org.junit.Assert.assertNotNull(bigDecimalArray57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(bigMatrix60);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigMatrix64);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigMatrix68);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigDecimal76);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 97 + "'", int81 == 97);
        org.junit.Assert.assertNotNull(bigDecimal84);
        org.junit.Assert.assertNotNull(bigDecimalArray85);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (byte) -54);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.ulp();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        byte byte6 = bigDecimal4.byteValueExact();
        java.math.MathContext mathContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigDecimal2.divide(bigDecimal4, mathContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl8 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl9 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        int int10 = bigMatrixImpl9.getColumnDimension();
        java.lang.String[] strArray12 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray12 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(strArray13);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray13);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(strArray13);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray13);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray13);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray13);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray13);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(strArray13);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray13);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(strArray13);
        double[] doubleArray25 = bigMatrixImpl23.getColumnAsDoubleArray((int) (short) 0);
        java.math.BigDecimal[] bigDecimalArray26 = bigMatrixImpl9.operate(doubleArray25);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(bigMatrix4);
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertNotNull(bigMatrix7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertNotNull(bigMatrix17);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
        org.junit.Assert.assertNotNull(bigDecimalArray26);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.lang.String str15 = bigMatrixImpl14.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl14.getColumnMatrix((int) (short) 2805);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "BigMatrixImpl{{1,100},{1,100},{1,100},{1,100}}" + "'", str15, "BigMatrixImpl{{1,100},{1,100},{1,100},{1,100}}");
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl14.getDataRef();
        bigMatrixImpl14.setScale((int) (short) 100);
        boolean boolean20 = bigMatrixImpl14.isSingular();
        int int21 = bigMatrixImpl14.getScale();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = bigDecimal23.setScale(0);
        double[] doubleArray31 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrix33.scalarAdd((double) 6);
        int int36 = realMatrix33.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrix33.scalarAdd(10.0d);
        double[] doubleArray43 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix44 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray43);
        double double45 = realMatrix44.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrix44.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrix38.preMultiply(realMatrix47);
        boolean boolean49 = bigDecimal26.equals((java.lang.Object) realMatrix38);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl14.scalarAdd(bigDecimal26);
        java.math.BigDecimal[] bigDecimalArray52 = bigMatrixImpl14.getRow(2);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) (byte) 97);
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl14.scalarMultiply(bigDecimal54);
        java.math.BigDecimal bigDecimal56 = bigMatrixImpl14.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 52.0d + "'", double45 == 52.0d);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(bigMatrix50);
        org.junit.Assert.assertNotNull(bigDecimalArray52);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigMatrix55);
        org.junit.Assert.assertNotNull(bigDecimal56);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException1 = new org.apache.commons.math.linear.InvalidMatrixException("org.apache.commons.math.linear.MatrixIndexException: ");
        java.lang.Throwable[] throwableArray2 = invalidMatrixException1.getSuppressed();
        java.lang.String str3 = invalidMatrixException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.linear.InvalidMatrixException: org.apache.commons.math.linear.MatrixIndexException: " + "'", str3, "org.apache.commons.math.linear.InvalidMatrixException: org.apache.commons.math.linear.MatrixIndexException: ");
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        double[] doubleArray6 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray13 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray20 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray27 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[][] doubleArray28 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27 };
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray28);
        double[][] doubleArray30 = realMatrix29.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix31 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray30);
        boolean boolean32 = realMatrix31.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrix31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrix33.scalarMultiply((double) 2881);
        // The following exception was thrown during execution in test generation
        try {
            double double38 = realMatrix35.getEntry(3, 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix35);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl14.getNorm();
        int int18 = bigMatrixImpl14.getScale();
        boolean boolean19 = bigMatrixImpl14.isSingular();
        int int20 = bigMatrixImpl14.getRoundingMode();
        java.lang.String str21 = bigMatrixImpl14.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(3, 400);
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl24.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            bigMatrixImpl14.setSubMatrix(bigDecimalArray25, (int) (short) 85, 50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "BigMatrixImpl{{1,100},{1,100},{1,100},{1,100}}" + "'", str21, "BigMatrixImpl{{1,100},{1,100},{1,100},{1,100}}");
        org.junit.Assert.assertNotNull(bigDecimalArray25);
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 97);
        double double2 = realMatrix1.getDeterminant();
        boolean boolean3 = realMatrix1.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrix1.scalarAdd(8668.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrix1.scalarAdd((double) (byte) 4);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrix7.copy();
        double double9 = realMatrix8.getNorm();
        org.junit.Assert.assertNotNull(realMatrix1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 389.0d + "'", double9 == 389.0d);
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(0.0d);
        int int36 = bigDecimal35.intValue();
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(0.0d);
        int int39 = bigDecimal38.intValue();
        java.math.BigDecimal bigDecimal40 = bigDecimal35.min(bigDecimal38);
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal40 };
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal(0.0d);
        int int47 = bigDecimal46.intValue();
        java.math.BigDecimal bigDecimal48 = bigDecimal43.min(bigDecimal46);
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal48 };
        java.math.BigDecimal bigDecimal51 = new java.math.BigDecimal(0.0d);
        int int52 = bigDecimal51.intValue();
        java.math.BigDecimal bigDecimal54 = new java.math.BigDecimal(0.0d);
        int int55 = bigDecimal54.intValue();
        java.math.BigDecimal bigDecimal56 = bigDecimal51.min(bigDecimal54);
        java.math.BigDecimal[] bigDecimalArray57 = new java.math.BigDecimal[] { bigDecimal56 };
        java.math.BigDecimal[][] bigDecimalArray58 = new java.math.BigDecimal[][] { bigDecimalArray41, bigDecimalArray49, bigDecimalArray57 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.math.BigDecimal[][] bigDecimalArray60 = bigMatrixImpl59.getDataRef();
        double[] doubleArray63 = new double[] { 1.0d, 100.0f };
        double[] doubleArray66 = new double[] { 1.0d, 100.0f };
        double[] doubleArray69 = new double[] { 1.0d, 100.0f };
        double[] doubleArray72 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray73 = new double[][] { doubleArray63, doubleArray66, doubleArray69, doubleArray72 };
        org.apache.commons.math.linear.BigMatrix bigMatrix74 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray73);
        boolean boolean75 = bigMatrixImpl59.equals((java.lang.Object) bigMatrix74);
        int int76 = bigMatrixImpl59.getRowDimension();
        boolean boolean77 = bigMatrixImpl59.isSquare();
        java.math.BigDecimal[][] bigDecimalArray78 = bigMatrixImpl59.getData();
        java.lang.String str79 = bigMatrixImpl59.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix80 = bigMatrixImpl27.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
        int int81 = bigMatrixImpl27.getRowDimension();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimalArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimalArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimalArray57);
        org.junit.Assert.assertNotNull(bigDecimalArray58);
        org.junit.Assert.assertNotNull(bigDecimalArray60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertNotNull(bigMatrix74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "BigMatrixImpl{{0},{0},{0}}" + "'", str79, "BigMatrixImpl{{0},{0},{0}}");
        org.junit.Assert.assertNotNull(bigMatrix80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 3 + "'", int81 == 3);
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        java.lang.String str14 = bigDecimal13.toString();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal17 = bigDecimal16.stripTrailingZeros();
        int int18 = bigDecimal16.signum();
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal13.divideAndRemainder(bigDecimal16);
        java.math.BigDecimal bigDecimal21 = bigDecimal13.pow((int) 'a');
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigIntegerExact();
        java.math.BigDecimal bigDecimal33 = bigDecimal21.add(bigDecimal23);
        java.math.BigDecimal bigDecimal34 = bigDecimal7.multiply(bigDecimal21);
        java.math.BigDecimal bigDecimal35 = bigDecimal7.ulp();
        java.math.BigDecimal bigDecimal37 = new java.math.BigDecimal((int) (byte) 10);
        java.math.BigDecimal bigDecimal38 = bigDecimal7.add(bigDecimal37);
        int int39 = bigDecimal7.signum();
        java.math.BigInteger bigInteger40 = bigDecimal7.toBigIntegerExact();
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal(0.0d);
        java.lang.String str43 = bigDecimal42.toString();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal46 = bigDecimal45.stripTrailingZeros();
        int int47 = bigDecimal45.signum();
        java.math.BigDecimal[] bigDecimalArray48 = bigDecimal42.divideAndRemainder(bigDecimal45);
        java.math.BigDecimal bigDecimal50 = bigDecimal42.pow((int) 'a');
        java.math.BigInteger bigInteger51 = bigDecimal42.toBigInteger();
        java.math.BigDecimal bigDecimal52 = new java.math.BigDecimal(bigInteger51);
        int int53 = bigDecimal52.intValueExact();
        java.math.BigInteger bigInteger54 = bigDecimal52.toBigInteger();
        java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal(bigInteger54);
        java.math.BigDecimal bigDecimal56 = bigDecimal7.max(bigDecimal55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0" + "'", str43, "0");
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray48);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigDecimal56);
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 388, (int) (short) 4);
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException1 = new org.apache.commons.math.linear.InvalidMatrixException("org.apache.commons.math.linear.InvalidMatrixException: 0");
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.setScale(0);
        double[] doubleArray9 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrix11.scalarAdd((double) 6);
        int int14 = realMatrix11.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrix11.scalarAdd(10.0d);
        double[] doubleArray21 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix22 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray21);
        double double23 = realMatrix22.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrix22.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrix16.preMultiply(realMatrix25);
        boolean boolean27 = bigDecimal4.equals((java.lang.Object) realMatrix16);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrix16.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrix28.scalarMultiply((double) (byte) 97);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrix28.copy();
        int int32 = realMatrix28.getRowDimension();
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        java.lang.String str35 = bigDecimal34.toString();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal38 = bigDecimal37.stripTrailingZeros();
        int int39 = bigDecimal37.signum();
        java.math.BigDecimal[] bigDecimalArray40 = bigDecimal34.divideAndRemainder(bigDecimal37);
        java.math.BigDecimal bigDecimal42 = bigDecimal34.pow((int) 'a');
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(0.0d);
        java.lang.String str45 = bigDecimal44.toString();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal48 = bigDecimal47.stripTrailingZeros();
        int int49 = bigDecimal47.signum();
        java.math.BigDecimal[] bigDecimalArray50 = bigDecimal44.divideAndRemainder(bigDecimal47);
        java.math.BigDecimal bigDecimal52 = bigDecimal44.pow((int) 'a');
        java.math.BigInteger bigInteger53 = bigDecimal44.toBigIntegerExact();
        java.math.BigDecimal bigDecimal54 = bigDecimal42.add(bigDecimal44);
        double[] doubleArray59 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix60 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray59);
        double[] doubleArray65 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix66 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray65);
        double[] doubleArray67 = realMatrix60.operate(doubleArray65);
        boolean boolean68 = bigDecimal44.equals((java.lang.Object) doubleArray65);
        double[] doubleArray69 = realMatrix28.operate(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrix70.getRowMatrix((int) (short) -3072);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray40);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray50);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[2805.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[3415.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix70);
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 10);
        double double2 = realMatrix1.getTrace();
        boolean boolean3 = realMatrix1.isSquare();
        double[] doubleArray8 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix9 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray8);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray8);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrix10.scalarAdd((double) 100.0f);
        boolean boolean13 = realMatrix10.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrix1.subtract(realMatrix10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray4 = bigDecimal1.divideAndRemainder(bigDecimal3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        double[] doubleArray7 = bigMatrixImpl5.getRowAsDoubleArray(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl5.copy();
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[] doubleArray14 = new double[] { 1.0d, 100.0f };
        double[] doubleArray17 = new double[] { 1.0d, 100.0f };
        double[] doubleArray20 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl23.transpose();
        int int25 = bigMatrixImpl23.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl23.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl5.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl23);
        bigMatrixImpl23.setRoundingMode(110);
        java.math.BigDecimal bigDecimal30 = bigMatrixImpl23.getNorm();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((double) (-1));
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal35 = bigDecimal34.abs();
        java.math.BigDecimal bigDecimal36 = bigDecimal32.max(bigDecimal34);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal38 = bigDecimal30.divide(bigDecimal36, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimalArray4);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertNotNull(bigMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(bigMatrix24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(bigDecimalArray26);
        org.junit.Assert.assertNotNull(bigMatrix27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(strArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl27.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl27.getNorm();
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal(0.0d);
        int int42 = bigDecimal41.intValue();
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(0.0d);
        int int45 = bigDecimal44.intValue();
        java.math.BigDecimal bigDecimal46 = bigDecimal41.min(bigDecimal44);
        java.math.BigInteger bigInteger47 = bigDecimal41.toBigInteger();
        java.math.BigDecimal bigDecimal48 = bigDecimal39.max(bigDecimal41);
        java.math.BigInteger bigInteger49 = bigDecimal39.unscaledValue();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(bigInteger49);
        java.math.BigDecimal bigDecimal51 = new java.math.BigDecimal(bigInteger49);
        java.math.BigDecimal bigDecimal53 = bigDecimal51.movePointLeft((-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(bigMatrix38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigDecimal53);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException1 = new org.apache.commons.math.linear.MatrixIndexException("97");
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException2 = new org.apache.commons.math.linear.MatrixIndexException();
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException3 = new org.apache.commons.math.linear.InvalidMatrixException();
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException4 = new org.apache.commons.math.linear.InvalidMatrixException();
        invalidMatrixException3.addSuppressed((java.lang.Throwable) invalidMatrixException4);
        matrixIndexException2.addSuppressed((java.lang.Throwable) invalidMatrixException4);
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException8 = new org.apache.commons.math.linear.MatrixIndexException("0.00000000000000000000000000000000");
        invalidMatrixException4.addSuppressed((java.lang.Throwable) matrixIndexException8);
        java.lang.Throwable[] throwableArray10 = invalidMatrixException4.getSuppressed();
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException12 = new org.apache.commons.math.linear.InvalidMatrixException("2805");
        invalidMatrixException4.addSuppressed((java.lang.Throwable) invalidMatrixException12);
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException15 = new org.apache.commons.math.linear.InvalidMatrixException("970");
        invalidMatrixException12.addSuppressed((java.lang.Throwable) invalidMatrixException15);
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException18 = new org.apache.commons.math.linear.InvalidMatrixException("org.apache.commons.math.linear.MatrixIndexException: ");
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException19 = new org.apache.commons.math.linear.InvalidMatrixException();
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException20 = new org.apache.commons.math.linear.InvalidMatrixException();
        invalidMatrixException19.addSuppressed((java.lang.Throwable) invalidMatrixException20);
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException23 = new org.apache.commons.math.linear.MatrixIndexException("100");
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException24 = new org.apache.commons.math.linear.InvalidMatrixException();
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException25 = new org.apache.commons.math.linear.InvalidMatrixException();
        invalidMatrixException24.addSuppressed((java.lang.Throwable) invalidMatrixException25);
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException28 = new org.apache.commons.math.linear.MatrixIndexException("");
        invalidMatrixException24.addSuppressed((java.lang.Throwable) matrixIndexException28);
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException31 = new org.apache.commons.math.linear.MatrixIndexException("");
        matrixIndexException28.addSuppressed((java.lang.Throwable) matrixIndexException31);
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException33 = new org.apache.commons.math.linear.InvalidMatrixException();
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException34 = new org.apache.commons.math.linear.InvalidMatrixException();
        invalidMatrixException33.addSuppressed((java.lang.Throwable) invalidMatrixException34);
        org.apache.commons.math.linear.MatrixIndexException matrixIndexException37 = new org.apache.commons.math.linear.MatrixIndexException("");
        invalidMatrixException33.addSuppressed((java.lang.Throwable) matrixIndexException37);
        matrixIndexException28.addSuppressed((java.lang.Throwable) invalidMatrixException33);
        matrixIndexException23.addSuppressed((java.lang.Throwable) invalidMatrixException33);
        invalidMatrixException19.addSuppressed((java.lang.Throwable) matrixIndexException23);
        org.apache.commons.math.linear.InvalidMatrixException invalidMatrixException43 = new org.apache.commons.math.linear.InvalidMatrixException("100");
        matrixIndexException23.addSuppressed((java.lang.Throwable) invalidMatrixException43);
        invalidMatrixException18.addSuppressed((java.lang.Throwable) invalidMatrixException43);
        java.lang.Throwable[] throwableArray46 = invalidMatrixException43.getSuppressed();
        invalidMatrixException15.addSuppressed((java.lang.Throwable) invalidMatrixException43);
        matrixIndexException1.addSuppressed((java.lang.Throwable) invalidMatrixException43);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(strArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl27.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal(0.0d);
        java.lang.String str41 = bigDecimal40.toString();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = bigDecimal43.stripTrailingZeros();
        int int45 = bigDecimal43.signum();
        java.math.BigDecimal[] bigDecimalArray46 = bigDecimal40.divideAndRemainder(bigDecimal43);
        java.math.BigDecimal bigDecimal48 = bigDecimal40.pow((int) 'a');
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        java.lang.String str51 = bigDecimal50.toString();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        int int55 = bigDecimal53.signum();
        java.math.BigDecimal[] bigDecimalArray56 = bigDecimal50.divideAndRemainder(bigDecimal53);
        java.math.BigDecimal bigDecimal58 = bigDecimal50.pow((int) 'a');
        java.math.BigInteger bigInteger59 = bigDecimal50.toBigIntegerExact();
        java.math.BigDecimal bigDecimal60 = bigDecimal48.add(bigDecimal50);
        java.math.BigInteger bigInteger61 = bigDecimal60.unscaledValue();
        java.math.BigInteger bigInteger62 = bigDecimal60.toBigIntegerExact();
        boolean boolean63 = bigMatrixImpl27.equals((java.lang.Object) bigInteger62);
        int int64 = bigMatrixImpl27.getRowDimension();
        double[] doubleArray67 = new double[] { 1.0d, 100.0f };
        double[] doubleArray70 = new double[] { 1.0d, 100.0f };
        double[] doubleArray73 = new double[] { 1.0d, 100.0f };
        double[] doubleArray76 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray77 = new double[][] { doubleArray67, doubleArray70, doubleArray73, doubleArray76 };
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray77);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.BigMatrix bigMatrix80 = bigMatrixImpl79.transpose();
        double[] doubleArray82 = bigMatrixImpl79.getRowAsDoubleArray((int) (short) 0);
        boolean boolean83 = bigMatrixImpl79.isSingular();
        boolean boolean84 = bigMatrixImpl79.isSquare();
        int int85 = bigMatrixImpl79.getScale();
        java.math.BigDecimal bigDecimal86 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal88 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger89 = bigDecimal88.unscaledValue();
        java.math.BigDecimal bigDecimal90 = bigDecimal86.add(bigDecimal88);
        java.math.BigDecimal bigDecimal92 = bigDecimal88.setScale(100);
        boolean boolean93 = bigMatrixImpl79.equals((java.lang.Object) bigDecimal88);
        java.lang.String str94 = bigDecimal88.toPlainString();
        org.apache.commons.math.linear.BigMatrix bigMatrix95 = bigMatrixImpl27.scalarAdd(bigDecimal88);
        java.math.BigDecimal bigDecimal97 = bigDecimal88.movePointRight((int) (byte) 0);
        java.math.BigDecimal bigDecimal98 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal99 = bigDecimal97.min(bigDecimal98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(bigMatrix38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray46);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0" + "'", str51, "0");
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray56);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertNotNull(bigMatrix78);
        org.junit.Assert.assertNotNull(bigMatrix80);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 64 + "'", int85 == 64);
        org.junit.Assert.assertNotNull(bigDecimal86);
        org.junit.Assert.assertNotNull(bigDecimal88);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigDecimal90);
        org.junit.Assert.assertNotNull(bigDecimal92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "100" + "'", str94, "100");
        org.junit.Assert.assertNotNull(bigMatrix95);
        org.junit.Assert.assertNotNull(bigDecimal97);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(1);
        org.apache.commons.math.linear.RealMatrix realMatrix3 = realMatrix1.scalarAdd(0.0d);
        boolean boolean4 = realMatrix3.isSquare();
        int int5 = realMatrix3.getRowDimension();
        double double6 = realMatrix3.getTrace();
        double[] doubleArray9 = new double[] { 1.0d, 100.0f };
        double[] doubleArray12 = new double[] { 1.0d, 100.0f };
        double[] doubleArray15 = new double[] { 1.0d, 100.0f };
        double[] doubleArray18 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl21.transpose();
        double[] doubleArray24 = bigMatrixImpl21.getRowAsDoubleArray((int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrix25.transpose();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrix3.multiply(realMatrix26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix1);
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(bigMatrix20);
        org.junit.Assert.assertNotNull(bigMatrix22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl27.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl27.transpose();
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl27.transpose();
        bigMatrixImpl27.setRoundingMode(2);
        int int36 = bigMatrixImpl27.getRoundingMode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray31);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertNotNull(bigMatrix33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        char[] charArray2 = new char[] { '4', '4' };
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(charArray2);
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(charArray2);
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal(charArray2);
        java.math.MathContext mathContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(charArray2, (int) (byte) 0, (int) (byte) 32, mathContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, 4]");
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal2 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        java.lang.String str5 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal8 = bigDecimal7.stripTrailingZeros();
        int int9 = bigDecimal7.signum();
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal4.divideAndRemainder(bigDecimal7);
        java.math.BigDecimal bigDecimal12 = bigDecimal4.pow((int) 'a');
        java.math.BigInteger bigInteger13 = bigDecimal4.toBigIntegerExact();
        int int14 = bigDecimal4.precision();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        java.lang.String str17 = bigDecimal16.toString();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal20 = bigDecimal19.stripTrailingZeros();
        int int21 = bigDecimal19.signum();
        java.math.BigDecimal[] bigDecimalArray22 = bigDecimal16.divideAndRemainder(bigDecimal19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl23.getNorm();
        java.math.BigDecimal bigDecimal26 = new java.math.BigDecimal(0.0d);
        java.lang.String str27 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal30 = bigDecimal29.stripTrailingZeros();
        int int31 = bigDecimal29.signum();
        java.math.BigDecimal[] bigDecimalArray32 = bigDecimal26.divideAndRemainder(bigDecimal29);
        java.math.BigDecimal bigDecimal34 = bigDecimal26.pow((int) 'a');
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal37 = bigDecimal36.stripTrailingZeros();
        float float38 = bigDecimal36.floatValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal34.divideToIntegralValue(bigDecimal36);
        boolean boolean40 = bigMatrixImpl23.equals((java.lang.Object) bigDecimal36);
        java.math.BigDecimal[] bigDecimalArray41 = bigDecimal4.divideAndRemainder(bigDecimal36);
        java.math.BigDecimal bigDecimal42 = bigDecimal1.add(bigDecimal36);
        double[] doubleArray49 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray56 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray63 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray70 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[][] doubleArray71 = new double[][] { doubleArray49, doubleArray56, doubleArray63, doubleArray70 };
        org.apache.commons.math.linear.RealMatrix realMatrix72 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray71);
        double[][] doubleArray73 = realMatrix72.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray73);
        boolean boolean75 = bigMatrixImpl74.isSquare();
        int int76 = bigMatrixImpl74.getRowDimension();
        java.math.BigDecimal bigDecimal77 = bigMatrixImpl74.getNorm();
        java.math.BigDecimal bigDecimal79 = bigDecimal77.movePointLeft((int) (short) 2805);
        java.math.BigDecimal bigDecimal80 = bigDecimal1.subtract(bigDecimal79);
        java.math.BigDecimal bigDecimal81 = bigDecimal1.stripTrailingZeros();
        short short82 = bigDecimal81.shortValue();
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray22);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 97.0f + "'", float38 == 97.0f);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bigDecimalArray41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[97.0, 2.0, -1.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertNotNull(bigDecimal77);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigDecimal80);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 97 + "'", short82 == (short) 97);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) (byte) -112);
        org.apache.commons.math.linear.RealMatrix realMatrix3 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 97);
        double[] doubleArray5 = realMatrix3.getColumn(4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        boolean boolean7 = bigMatrix6.isSingular();
        boolean boolean8 = bigDecimal1.equals((java.lang.Object) bigMatrix6);
        java.lang.String str9 = bigDecimal1.toPlainString();
        java.math.BigInteger bigInteger10 = bigDecimal1.toBigIntegerExact();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(bigInteger10, (int) (byte) 6);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf(1L, (int) (short) 31464);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = bigDecimal12.divide(bigDecimal15, 400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-112" + "'", str9, "-112");
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigDecimal15);
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(strArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl27.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl27.getNorm();
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl27.getData();
        java.math.BigDecimal bigDecimal41 = bigMatrixImpl27.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal42 = bigMatrixImpl27.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(bigMatrix38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimalArray40);
        org.junit.Assert.assertNotNull(bigDecimal41);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        org.apache.commons.math.linear.RealMatrix realMatrix1 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 10);
        double double2 = realMatrix1.getTrace();
        boolean boolean3 = realMatrix1.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrix1.scalarAdd((double) 5);
        int int6 = realMatrix1.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrix1.scalarAdd(8667.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrix8.scalarMultiply((double) 97L);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 10);
        double double13 = realMatrix12.getTrace();
        boolean boolean14 = realMatrix12.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrix12.scalarMultiply((double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrix8.multiply(realMatrix12);
        int int18 = realMatrix17.getRowDimension();
        org.junit.Assert.assertNotNull(realMatrix1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = bigDecimal7.pow(3);
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(0.0d);
        java.lang.String str16 = bigDecimal15.toString();
        java.math.BigDecimal bigDecimal18 = bigDecimal15.setScale(0);
        byte byte19 = bigDecimal18.byteValueExact();
        java.math.BigDecimal bigDecimal20 = bigDecimal18.plus();
        java.math.BigDecimal bigDecimal21 = bigDecimal13.max(bigDecimal20);
        java.math.BigDecimal bigDecimal22 = bigDecimal20.abs();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.stripTrailingZeros();
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray7);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl9 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = bigMatrixImpl9.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigMatrix8);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray4 = bigDecimal1.divideAndRemainder(bigDecimal3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl5.copy();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(0.0d);
        java.lang.String str9 = bigDecimal8.toString();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal12 = bigDecimal11.stripTrailingZeros();
        int int13 = bigDecimal11.signum();
        java.math.BigDecimal[] bigDecimalArray14 = bigDecimal8.divideAndRemainder(bigDecimal11);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        int int16 = bigMatrixImpl15.getRoundingMode();
        boolean boolean17 = bigMatrixImpl15.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = bigMatrix6.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl15);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl15.copy();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = bigMatrix19.getColumnAsDoubleArray((-3));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimalArray4);
        org.junit.Assert.assertNotNull(bigMatrix6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigMatrix18);
        org.junit.Assert.assertNotNull(bigMatrix19);
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        double[] doubleArray10 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray10);
        double[] doubleArray12 = realMatrix5.operate(doubleArray10);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrix14.transpose();
        double[][] doubleArray16 = realMatrix14.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        double[] doubleArray20 = new double[] { 1.0d, 100.0f };
        double[] doubleArray23 = new double[] { 1.0d, 100.0f };
        double[] doubleArray26 = new double[] { 1.0d, 100.0f };
        double[] doubleArray29 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray30);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl32.transpose();
        double[] doubleArray35 = bigMatrixImpl32.getRowAsDoubleArray((int) (short) 0);
        java.lang.String str36 = bigMatrixImpl32.toString();
        int int37 = bigMatrixImpl32.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl17.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl32);
        int int39 = bigMatrixImpl32.getScale();
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal(0.0d);
        java.lang.String str42 = bigDecimal41.toString();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal45 = bigDecimal44.stripTrailingZeros();
        int int46 = bigDecimal44.signum();
        java.math.BigDecimal[] bigDecimalArray47 = bigDecimal41.divideAndRemainder(bigDecimal44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray47);
        int int49 = bigMatrixImpl48.getRoundingMode();
        boolean boolean50 = bigMatrixImpl48.isSquare();
        bigMatrixImpl48.setRoundingMode((int) (byte) 10);
        int int53 = bigMatrixImpl48.getRoundingMode();
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray58 = bigDecimal55.divideAndRemainder(bigDecimal57);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.math.BigDecimal[] bigDecimalArray61 = bigMatrixImpl48.preMultiply(bigDecimalArray58);
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray61);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray63 = bigMatrixImpl32.operate(bigDecimalArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 52.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[2805.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(bigMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(bigMatrix31);
        org.junit.Assert.assertNotNull(bigMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "BigMatrixImpl{{1,100},{1,100},{1,100},{1,100}}" + "'", str36, "BigMatrixImpl{{1,100},{1,100},{1,100},{1,100}}");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNotNull(bigMatrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimalArray58);
        org.junit.Assert.assertNotNull(bigDecimalArray61);
        org.junit.Assert.assertNotNull(bigMatrix62);
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        char[] charArray2 = new char[] { '4', '4' };
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(charArray2);
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(charArray2);
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal(charArray2);
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(charArray2);
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(charArray2);
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(charArray2);
        java.math.MathContext mathContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(charArray2, (int) (short) 35, 32, mathContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, 4]");
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        bigMatrixImpl27.setRoundingMode(10);
        int int31 = bigMatrixImpl27.getScale();
        java.math.BigDecimal bigDecimal33 = new java.math.BigDecimal(0.0d);
        java.lang.String str34 = bigDecimal33.toString();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal37 = bigDecimal36.stripTrailingZeros();
        int int38 = bigDecimal36.signum();
        java.math.BigDecimal[] bigDecimalArray39 = bigDecimal33.divideAndRemainder(bigDecimal36);
        java.math.BigDecimal bigDecimal41 = bigDecimal33.pow((int) 'a');
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = bigDecimal43.stripTrailingZeros();
        float float45 = bigDecimal43.floatValue();
        java.math.BigDecimal bigDecimal46 = bigDecimal41.divideToIntegralValue(bigDecimal43);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.ulp();
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl27.scalarMultiply(bigDecimal47);
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        int int51 = bigDecimal50.intValue();
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(0.0d);
        int int54 = bigDecimal53.intValue();
        java.math.BigDecimal bigDecimal55 = bigDecimal50.min(bigDecimal53);
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal55 };
        java.math.BigDecimal bigDecimal58 = new java.math.BigDecimal(0.0d);
        int int59 = bigDecimal58.intValue();
        java.math.BigDecimal bigDecimal61 = new java.math.BigDecimal(0.0d);
        int int62 = bigDecimal61.intValue();
        java.math.BigDecimal bigDecimal63 = bigDecimal58.min(bigDecimal61);
        java.math.BigDecimal[] bigDecimalArray64 = new java.math.BigDecimal[] { bigDecimal63 };
        java.math.BigDecimal bigDecimal66 = new java.math.BigDecimal(0.0d);
        int int67 = bigDecimal66.intValue();
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(0.0d);
        int int70 = bigDecimal69.intValue();
        java.math.BigDecimal bigDecimal71 = bigDecimal66.min(bigDecimal69);
        java.math.BigDecimal[] bigDecimalArray72 = new java.math.BigDecimal[] { bigDecimal71 };
        java.math.BigDecimal[][] bigDecimalArray73 = new java.math.BigDecimal[][] { bigDecimalArray56, bigDecimalArray64, bigDecimalArray72 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray73);
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray73);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray73);
        java.math.BigDecimal[][] bigDecimalArray77 = bigMatrixImpl76.getDataRef();
        java.math.BigDecimal bigDecimal78 = bigMatrixImpl76.getNorm();
        java.math.BigDecimal[] bigDecimalArray80 = bigMatrixImpl76.getColumn(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray80);
        java.math.BigDecimal[] bigDecimalArray82 = bigMatrixImpl27.preMultiply(bigDecimalArray80);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl83 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray80);
        org.apache.commons.math.linear.BigMatrix bigMatrix84 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray80);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray86 = bigMatrix84.getRowAsDoubleArray(32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimalArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimalArray23);
        org.junit.Assert.assertNotNull(bigDecimalArray24);
        org.junit.Assert.assertNotNull(bigMatrix26);
        org.junit.Assert.assertNotNull(bigDecimalArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 97.0f + "'", float45 == 97.0f);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigMatrix48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimalArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimalArray64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimalArray72);
        org.junit.Assert.assertNotNull(bigDecimalArray73);
        org.junit.Assert.assertNotNull(bigMatrix75);
        org.junit.Assert.assertNotNull(bigDecimalArray77);
        org.junit.Assert.assertNotNull(bigDecimal78);
        org.junit.Assert.assertNotNull(bigDecimalArray80);
        org.junit.Assert.assertNotNull(bigMatrix81);
        org.junit.Assert.assertNotNull(bigDecimalArray82);
        org.junit.Assert.assertNotNull(bigMatrix84);
    }
}

