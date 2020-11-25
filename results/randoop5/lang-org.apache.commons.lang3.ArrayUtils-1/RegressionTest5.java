import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray7);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '-1.0', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray9);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray9, true);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray9);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.add(booleanArray23, 0, true);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray23, 4, (int) (byte) 10);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.add(booleanArray29, (int) (byte) 1, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false]");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray18, true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) 1L);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray16, 4, (int) (short) 100);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray21);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (short) 1, 0);
        int[] intArray12 = new int[] { (byte) 10, 1 };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, (int) (short) 100, 100);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray12);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray12, (int) 'a');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray18);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.subarray(intArray6, 3, (int) (short) -1);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray22, (int) (byte) -1);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray22, 6, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = new float[] { (-1L), (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) (byte) 10);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) '#', (int) 'a');
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.remove(floatArray21, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray13, floatArray21);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(floatArray13, (float) '#');
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray13, floatArray32);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray32, 7, 100);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.Byte[] byteArray1 = new java.lang.Byte[] { (byte) -1 };
        java.lang.Byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1, (byte) 1);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray13, (byte) 0);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray13, (byte) 10);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray23 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray23, (byte) -1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray25);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.add(byteArray25, (byte) 100);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray18, byteArray28);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray13, byteArray28);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.clone(byteArray30);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray30);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray30);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double[] doubleArray2 = new double[] { 8, 8 };
        double[] doubleArray5 = new double[] { 8, 8 };
        double[] doubleArray8 = new double[] { 8, 8 };
        double[] doubleArray11 = new double[] { 8, 8 };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        double[] doubleArray15 = new double[] { 8, 8 };
        double[] doubleArray18 = new double[] { 8, 8 };
        double[] doubleArray21 = new double[] { 8, 8 };
        double[] doubleArray24 = new double[] { 8, 8 };
        double[][] doubleArray25 = new double[][] { doubleArray15, doubleArray18, doubleArray21, doubleArray24 };
        double[][][] doubleArray26 = new double[][][] { doubleArray12, doubleArray25 };
        double[][][] doubleArray29 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray26, 3, (int) (short) 10);
        double[][][] doubleArray32 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray26, (int) (byte) 10, (int) (short) 100);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[8.0, 8.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[8.0, 8.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[8.0, 8.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[8.0, 8.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[8.0, 8.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[8.0, 8.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[8.0, 8.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[8.0, 8.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (byte) 100);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray3, (byte) 0, (int) '#');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        float[] floatArray3 = new float[] { (byte) 0, 1.0f, (short) 10 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (int) (byte) 0, (float) 5);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, (int) ' ', (int) (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray3, (float) 7, (int) 'a');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 1, (float) 1);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[5.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 100, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 1, (int) (short) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray15, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 100, 100]");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        long[] longArray7 = new long[] { 100L, 'a' };
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (short) 10, 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray10);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray10, (long) 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray3, longArray10);
        java.lang.Long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toObject(longArray10);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray10, (int) (byte) -1, 1);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.add(longArray18, 0, (long) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray18, (long) (short) 0);
        long[] longArray26 = new long[] { 100L, 'a' };
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.subarray(longArray26, (int) (short) 10, 100);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray29);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray29, (long) 0);
        java.lang.Long[] longArray33 = org.apache.commons.lang3.ArrayUtils.toObject(longArray32);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33, 0L);
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33, (long) (byte) 10);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray18, longArray38);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.clone(longArray38);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray40);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray40, (long) 10);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[]");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        char[] charArray5 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (short) -1, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (byte) 10, 100);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray15);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4#  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4#  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, #,  ,  , 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ,  , #, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

