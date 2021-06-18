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
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { 10.0f, (short) 10, 'a' };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (-1.0d), (int) (byte) -1, (double) (-1.0f));
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.add(doubleArray18, (double) 100L);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray24);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray24);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, -1.0, 10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(shortArray15, (short) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray15);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[-1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 1 };
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, 0, (int) '#');
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 0);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray11, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (byte) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) intArray2, (java.lang.Object) byteArray17);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 1, 100, 100, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, 2, (short) 100);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, 2, (short) (byte) -1);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray12, (short) (byte) -1, (int) (byte) 100);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.clone(shortArray12);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray16);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.clone(shortArray16);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 100, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 100, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 100, -1, 100, 1]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) '#');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray7);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray7, (int) (byte) 0, 1);
        int[] intArray14 = new int[] { 0, 0 };
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray14);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 35, 0, 0]");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.Short[][] shortArray0 = new java.lang.Short[][] {};
        java.lang.Short[][] shortArray1 = new java.lang.Short[][] {};
        java.lang.Short[][] shortArray2 = new java.lang.Short[][] {};
        java.lang.Short[][] shortArray3 = new java.lang.Short[][] {};
        java.lang.Short[][][] shortArray4 = new java.lang.Short[][][] { shortArray0, shortArray1, shortArray2, shortArray3 };
        java.lang.Short[][][] shortArray5 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        byte[] byteArray7 = new byte[] { (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray7, byteArray9 };
        byte[] byteArray12 = new byte[] { (byte) 0 };
        byte[] byteArray14 = new byte[] { (byte) 0 };
        byte[][] byteArray15 = new byte[][] { byteArray12, byteArray14 };
        byte[][][] byteArray16 = new byte[][][] { byteArray10, byteArray15 };
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.clone(shortArray17);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray17, (short) 100);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray20, 1, 1);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray23, (short) 0, (int) (byte) 100);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray23, (short) (byte) 0);
        byte[][][] byteArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray16, (java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][] serializableArray30 = org.apache.commons.lang3.ArrayUtils.addAll((java.io.Serializable[][]) shortArray5, (java.io.Serializable[][]) byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot store [[B in an array of [[Ljava.lang.Short;");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[100]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, 100, (int) (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) doubleArray5, (java.lang.Object) longArray9);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, 100.0d);
        java.lang.Object obj13 = null;
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray5, obj13);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, 100.0d, 9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        int[] intArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (short) 1, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (byte) -1, (int) (byte) 1);
        java.lang.Character[] charArray17 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray11, charArray18);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 'a');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, a]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray5 = new boolean[] { false, true, true, false };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true, 10);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, 1);
        java.lang.Boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray5);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray20);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray5);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray24);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray24);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray24, (byte) 0);
        java.lang.Byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray24);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray24);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 1, 100, 100, 0, 100]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 0, (int) (short) 100);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray1, (short) (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray1);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        java.lang.Float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray12);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray14, (float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (int) (short) 10, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray27, (int) '4', (int) (byte) 1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, 0, (double) ' ');
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray27);
        java.lang.Double[] doubleArray39 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray39);
        java.lang.Long[] longArray41 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray39, (java.lang.Object) longArray41, (int) (short) 100);
        java.lang.Double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray39);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray39);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray39, (double) 100.0f);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray34, doubleArray47);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray48, (double) 100L, (int) (short) 100, (double) '#');
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray48, 0.0d, (int) (byte) 0, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, 100, (int) (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) doubleArray5, (java.lang.Object) longArray9);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, 100.0d);
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = wildcardClassArray2;
        java.lang.Class<?>[][] wildcardClassArray8 = org.apache.commons.lang3.ArrayUtils.toArray(wildcardClassArray5);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray10 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.reflect.AnnotatedElement[][]) wildcardClassArray5, 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(annotatedElementArray10);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray27, (int) '4', (int) (byte) 1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray30, (double) '4', 0.0d);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray30);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray30);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray30, 100.0d, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, '#');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = org.apache.commons.lang3.ArrayUtils.remove(charArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 1 };
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, 0, (int) '#');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        long[] longArray10 = new long[] { 10L, 100L, '#' };
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray10);
        java.lang.Long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toObject(longArray10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) charArray5, (java.lang.Object[]) longArray12);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray12);
        java.lang.Long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toObject(longArray14);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray15);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        java.lang.Character[] charArray13 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray7, (java.lang.Object) charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray18);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.addAll(charArray14, charArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, 'a');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, a,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) ' ');
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray16, 0.0d, 100, (double) 1.0f);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray16, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray8, (short) (byte) -1, (int) '#');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray8);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(shortArray8, (short) 0);
        short[] shortArray17 = null;
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray8, shortArray17);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][][][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray1, annotatedElementArray2 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray5 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray6 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray4, annotatedElementArray5 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray7 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray3, annotatedElementArray6 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray8 = org.apache.commons.lang3.ArrayUtils.addAll(annotatedElementArray0, annotatedElementArray7);
        java.lang.Object[][] objArray9 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Object[][]) annotatedElementArray7);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        org.junit.Assert.assertNotNull(annotatedElementArray6);
        org.junit.Assert.assertNotNull(annotatedElementArray7);
        org.junit.Assert.assertNotNull(annotatedElementArray8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Character[] charArray14 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray8, (java.lang.Object) charArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray0, (java.lang.Object[]) byteArray8);
        java.lang.Byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        java.lang.String str20 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray19);
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray19);
        java.lang.Byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray19);
        java.lang.Byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray22);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.clone(longArray10);
        java.lang.Byte[] byteArray16 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) -1);
        java.lang.Byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray25, (byte) 0);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(byteArray25, (byte) 0);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray19, (java.lang.Object) (byte) 0, (int) (byte) 0);
        java.lang.Byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray19);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        java.lang.Double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray33);
        java.lang.String str35 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) doubleArray34);
        java.lang.Object[] objArray36 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.Object[]) byteArray19, (java.lang.Object[]) doubleArray34);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray10, (java.lang.Object) byteArray19);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{}" + "'", str35, "{}");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, -1, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Object[]) charArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) charArray6);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.lang.Character[] charArray12 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.subarray(charArray14, (int) ' ', (int) '#');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray9, charArray17);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray20 = org.apache.commons.lang3.ArrayUtils.remove(charArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) (byte) 1, (int) (byte) 10);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (byte) 10);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, ' ');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) 100);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 0, (int) (short) 100);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 10);
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray1, shortArray8);
        java.lang.Short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray8);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.remove(shortArray8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(shortArray11);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) (short) 0, (int) (byte) 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 10, 0);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray7, (float) 'a');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(floatArray7, (float) 3);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray4);
        java.lang.Long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toObject(longArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray4, (long) (byte) 0);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.clone(longArray4);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (byte) 1, 0L);
        long[] longArray15 = new long[] { 100L, 'a' };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, (int) (short) 10, 100);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray18);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray18, (long) 0);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.subarray(longArray21, (-1), 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray21);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.subarray(longArray21, (int) (byte) 0, 100);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray21, (long) 1);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray21, (long) (short) 10);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.add(longArray32, (long) 3);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.addAll(longArray12, longArray32);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[32]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[32, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[3]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[32, 0]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        boolean[] booleanArray12 = new boolean[] { false, true, true, false };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true, 10);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, false);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        java.lang.Object[] objArray19 = new java.lang.Object[] { charArray7, booleanArray12 };
        double[] doubleArray23 = new double[] { (short) 100, 1, (-1.0d) };
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) 0.0f, (int) (short) 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, 0.0d, 10);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) (byte) 10);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray23, (double) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass35 = doubleArray23.getClass();
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray7, (java.lang.Object) wildcardClass35, 0);
        java.lang.Character[] charArray43 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray43);
        java.lang.Character[] charArray45 = org.apache.commons.lang3.ArrayUtils.toObject(charArray44);
        boolean[] booleanArray50 = new boolean[] { false, true, true, false };
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray50, true, 10);
        boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.add(booleanArray50, false);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray50);
        java.lang.Object[] objArray57 = new java.lang.Object[] { charArray45, booleanArray50 };
        double[] doubleArray61 = new double[] { (short) 100, 1, (-1.0d) };
        int int64 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray61, (double) 0.0f, (int) (short) 0);
        int int67 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray61, 0.0d, 10);
        int int69 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray61, (double) (byte) 10);
        int int72 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray61, (double) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass73 = doubleArray61.getClass();
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray45, (java.lang.Object) wildcardClass73, 0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray76 = new java.lang.reflect.AnnotatedElement[] { wildcardClass35, wildcardClass73 };
        long[] longArray79 = new long[] { 100L, 'a' };
        long[] longArray82 = org.apache.commons.lang3.ArrayUtils.subarray(longArray79, (int) (short) 10, 100);
        int int84 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray82, (long) ' ');
        java.lang.reflect.AnnotatedElement[] annotatedElementArray85 = org.apache.commons.lang3.ArrayUtils.removeElement(annotatedElementArray76, (java.lang.Object) int84);
        int[] intArray88 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray89 = org.apache.commons.lang3.ArrayUtils.toObject(intArray88);
        int[] intArray91 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray89, (int) 'a');
        int[] intArray93 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray89, (int) '#');
        int[] intArray94 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray89);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray95 = org.apache.commons.lang3.ArrayUtils.removeElement(annotatedElementArray85, (java.lang.Object) intArray89);
        int[] intArray96 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray89);
        boolean boolean97 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray96);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray99 = org.apache.commons.lang3.ArrayUtils.remove(intArray96, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[4, a,  , a, 4], [false, true, true, false]]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[[4, a,  , a, 4], [false, true, true, false]]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(annotatedElementArray76);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(annotatedElementArray85);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[35, 0]");
        org.junit.Assert.assertNotNull(annotatedElementArray95);
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int[] intArray6 = new int[] { (short) -1, (byte) 1, (short) 10, 4, 5, (short) 0 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int[] intArray8 = null;
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray8, 5);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.add(intArray10, 100);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray7, intArray10);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray14, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray14, (int) (byte) 10, 10);
        java.lang.Integer[] intArray20 = org.apache.commons.lang3.ArrayUtils.toObject(intArray14);
        java.lang.String str21 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray14);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.addAll(intArray7, intArray14);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 10, 4, 5, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 10, 4, 5, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[5]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[5, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{}" + "'", str21, "{}");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 1, 10, 4, 5, 0]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray0);
        java.lang.Integer[] intArray2 = org.apache.commons.lang3.ArrayUtils.toObject(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray2, (int) (byte) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 97]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.io.Serializable[] serializableArray5 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[]) doubleArray1, (int) '#', 1);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) doubleArray1);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1, (double) (short) 10);
        java.lang.Short[] shortArray12 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (short) 0);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray13, 2, (short) 100);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, 2, (short) (byte) -1);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.add(shortArray21, (short) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray21);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray1, (java.lang.Object) shortArray21);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(serializableArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[1, 100, -1, 100, -1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, 100, -1, 100, 1, 10]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (-1), 0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray20);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray29, (byte) 0);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(byteArray29, (byte) 100);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray29, 100, 0);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.contains(byteArray36, (byte) 0);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray23, byteArray36);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, 3, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, -1, -1, 0, 1, 100]");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 100);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray8, (short) (byte) 100, 8);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        long[] longArray1 = new long[] { 1L };
        long[][] longArray2 = new long[][] { longArray1 };
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        long[][] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, '#');
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a', (int) (byte) 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(charArray9, 'a');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        char[] charArray5 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray7 = null;
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.addAll(charArray5, charArray7);
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray5);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        java.lang.Byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray15);
        java.lang.Character[] charArray24 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray24);
        java.lang.Character[] charArray26 = org.apache.commons.lang3.ArrayUtils.toObject(charArray25);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray18, (java.lang.Object) charArray25);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.subarray(charArray25, (int) (short) 10, 100);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray30, '#');
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.clone(charArray30);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray33);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray33, '4');
        java.lang.Character[] charArray39 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray39);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray40);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.subarray(charArray41, (int) ' ', (int) '#');
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray36, charArray41);
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.addAll(charArray5, charArray41);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.add(charArray5, 2, '4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4#  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4#  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #,  ,  , 4]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "4#  4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "4#  4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[4, #,  ,  , 4, #, #]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4#4  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4#4  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4, #, 4,  ,  , 4]");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray5 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray0, annotatedElementArray1, annotatedElementArray2, annotatedElementArray3, annotatedElementArray4 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray6 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray7 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray8 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray9 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray10 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray11 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray6, annotatedElementArray7, annotatedElementArray8, annotatedElementArray9, annotatedElementArray10 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray12 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray5, annotatedElementArray11 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray13 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray14 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray15 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray16 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray17 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray18 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray13, annotatedElementArray14, annotatedElementArray15, annotatedElementArray16, annotatedElementArray17 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray19 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray20 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray21 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray22 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray23 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray24 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray19, annotatedElementArray20, annotatedElementArray21, annotatedElementArray22, annotatedElementArray23 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray25 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray18, annotatedElementArray24 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray26 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray27 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray28 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray29 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray30 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray31 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray26, annotatedElementArray27, annotatedElementArray28, annotatedElementArray29, annotatedElementArray30 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray32 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray33 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray34 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray35 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray36 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray37 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray32, annotatedElementArray33, annotatedElementArray34, annotatedElementArray35, annotatedElementArray36 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray38 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray31, annotatedElementArray37 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray39 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray40 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray41 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray42 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray43 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray44 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray39, annotatedElementArray40, annotatedElementArray41, annotatedElementArray42, annotatedElementArray43 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray45 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray46 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray47 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray48 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray49 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray50 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray45, annotatedElementArray46, annotatedElementArray47, annotatedElementArray48, annotatedElementArray49 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray51 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray44, annotatedElementArray50 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray52 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray53 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray54 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray55 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray56 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray57 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray52, annotatedElementArray53, annotatedElementArray54, annotatedElementArray55, annotatedElementArray56 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray58 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray59 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray60 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray61 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray62 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray63 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray58, annotatedElementArray59, annotatedElementArray60, annotatedElementArray61, annotatedElementArray62 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray64 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray57, annotatedElementArray63 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray65 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray66 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray67 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray68 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray69 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray70 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray65, annotatedElementArray66, annotatedElementArray67, annotatedElementArray68, annotatedElementArray69 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray71 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray72 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray73 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray74 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray75 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray76 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray71, annotatedElementArray72, annotatedElementArray73, annotatedElementArray74, annotatedElementArray75 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray77 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray70, annotatedElementArray76 };
        java.lang.reflect.AnnotatedElement[][][][][] annotatedElementArray78 = new java.lang.reflect.AnnotatedElement[][][][][] { annotatedElementArray12, annotatedElementArray25, annotatedElementArray38, annotatedElementArray51, annotatedElementArray64, annotatedElementArray77 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray79 = new java.lang.reflect.AnnotatedElement[][][][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray80 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray81 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray82 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray80, annotatedElementArray81 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray83 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray84 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray85 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray83, annotatedElementArray84 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray86 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray82, annotatedElementArray85 };
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray87 = org.apache.commons.lang3.ArrayUtils.addAll(annotatedElementArray79, annotatedElementArray86);
        java.lang.reflect.AnnotatedElement[][][][][] annotatedElementArray88 = org.apache.commons.lang3.ArrayUtils.add(annotatedElementArray78, annotatedElementArray87);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        org.junit.Assert.assertNotNull(annotatedElementArray6);
        org.junit.Assert.assertNotNull(annotatedElementArray7);
        org.junit.Assert.assertNotNull(annotatedElementArray8);
        org.junit.Assert.assertNotNull(annotatedElementArray9);
        org.junit.Assert.assertNotNull(annotatedElementArray10);
        org.junit.Assert.assertNotNull(annotatedElementArray11);
        org.junit.Assert.assertNotNull(annotatedElementArray12);
        org.junit.Assert.assertNotNull(annotatedElementArray13);
        org.junit.Assert.assertNotNull(annotatedElementArray14);
        org.junit.Assert.assertNotNull(annotatedElementArray15);
        org.junit.Assert.assertNotNull(annotatedElementArray16);
        org.junit.Assert.assertNotNull(annotatedElementArray17);
        org.junit.Assert.assertNotNull(annotatedElementArray18);
        org.junit.Assert.assertNotNull(annotatedElementArray19);
        org.junit.Assert.assertNotNull(annotatedElementArray20);
        org.junit.Assert.assertNotNull(annotatedElementArray21);
        org.junit.Assert.assertNotNull(annotatedElementArray22);
        org.junit.Assert.assertNotNull(annotatedElementArray23);
        org.junit.Assert.assertNotNull(annotatedElementArray24);
        org.junit.Assert.assertNotNull(annotatedElementArray25);
        org.junit.Assert.assertNotNull(annotatedElementArray26);
        org.junit.Assert.assertNotNull(annotatedElementArray27);
        org.junit.Assert.assertNotNull(annotatedElementArray28);
        org.junit.Assert.assertNotNull(annotatedElementArray29);
        org.junit.Assert.assertNotNull(annotatedElementArray30);
        org.junit.Assert.assertNotNull(annotatedElementArray31);
        org.junit.Assert.assertNotNull(annotatedElementArray32);
        org.junit.Assert.assertNotNull(annotatedElementArray33);
        org.junit.Assert.assertNotNull(annotatedElementArray34);
        org.junit.Assert.assertNotNull(annotatedElementArray35);
        org.junit.Assert.assertNotNull(annotatedElementArray36);
        org.junit.Assert.assertNotNull(annotatedElementArray37);
        org.junit.Assert.assertNotNull(annotatedElementArray38);
        org.junit.Assert.assertNotNull(annotatedElementArray39);
        org.junit.Assert.assertNotNull(annotatedElementArray40);
        org.junit.Assert.assertNotNull(annotatedElementArray41);
        org.junit.Assert.assertNotNull(annotatedElementArray42);
        org.junit.Assert.assertNotNull(annotatedElementArray43);
        org.junit.Assert.assertNotNull(annotatedElementArray44);
        org.junit.Assert.assertNotNull(annotatedElementArray45);
        org.junit.Assert.assertNotNull(annotatedElementArray46);
        org.junit.Assert.assertNotNull(annotatedElementArray47);
        org.junit.Assert.assertNotNull(annotatedElementArray48);
        org.junit.Assert.assertNotNull(annotatedElementArray49);
        org.junit.Assert.assertNotNull(annotatedElementArray50);
        org.junit.Assert.assertNotNull(annotatedElementArray51);
        org.junit.Assert.assertNotNull(annotatedElementArray52);
        org.junit.Assert.assertNotNull(annotatedElementArray53);
        org.junit.Assert.assertNotNull(annotatedElementArray54);
        org.junit.Assert.assertNotNull(annotatedElementArray55);
        org.junit.Assert.assertNotNull(annotatedElementArray56);
        org.junit.Assert.assertNotNull(annotatedElementArray57);
        org.junit.Assert.assertNotNull(annotatedElementArray58);
        org.junit.Assert.assertNotNull(annotatedElementArray59);
        org.junit.Assert.assertNotNull(annotatedElementArray60);
        org.junit.Assert.assertNotNull(annotatedElementArray61);
        org.junit.Assert.assertNotNull(annotatedElementArray62);
        org.junit.Assert.assertNotNull(annotatedElementArray63);
        org.junit.Assert.assertNotNull(annotatedElementArray64);
        org.junit.Assert.assertNotNull(annotatedElementArray65);
        org.junit.Assert.assertNotNull(annotatedElementArray66);
        org.junit.Assert.assertNotNull(annotatedElementArray67);
        org.junit.Assert.assertNotNull(annotatedElementArray68);
        org.junit.Assert.assertNotNull(annotatedElementArray69);
        org.junit.Assert.assertNotNull(annotatedElementArray70);
        org.junit.Assert.assertNotNull(annotatedElementArray71);
        org.junit.Assert.assertNotNull(annotatedElementArray72);
        org.junit.Assert.assertNotNull(annotatedElementArray73);
        org.junit.Assert.assertNotNull(annotatedElementArray74);
        org.junit.Assert.assertNotNull(annotatedElementArray75);
        org.junit.Assert.assertNotNull(annotatedElementArray76);
        org.junit.Assert.assertNotNull(annotatedElementArray77);
        org.junit.Assert.assertNotNull(annotatedElementArray78);
        org.junit.Assert.assertNotNull(annotatedElementArray79);
        org.junit.Assert.assertNotNull(annotatedElementArray80);
        org.junit.Assert.assertNotNull(annotatedElementArray81);
        org.junit.Assert.assertNotNull(annotatedElementArray82);
        org.junit.Assert.assertNotNull(annotatedElementArray83);
        org.junit.Assert.assertNotNull(annotatedElementArray84);
        org.junit.Assert.assertNotNull(annotatedElementArray85);
        org.junit.Assert.assertNotNull(annotatedElementArray86);
        org.junit.Assert.assertNotNull(annotatedElementArray87);
        org.junit.Assert.assertNotNull(annotatedElementArray88);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(intArray8, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        float[] floatArray3 = new float[] { (byte) 0, 1.0f, (short) 10 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (int) (byte) 0, (float) 5);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, (int) ' ', (int) (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray3, (float) 7, (int) 'a');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[5.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, 0.0d);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) (byte) 10, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray9, (float) 0);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray11, (-1.0f), 100);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray11);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(floatArray15, (float) (byte) 1);
        java.lang.Float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray15);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, 10.0f);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray15);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, 1.0, 10.0]");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        long[] longArray7 = new long[] { 100L, 'a' };
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (short) 10, 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray10);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray10, (long) 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray3, longArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray10);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray10, (long) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray10);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.subarray(longArray1, (int) (short) 1, (int) (byte) 100);
        long[] longArray9 = new long[] { ' ' };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray9);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.addAll(longArray9, longArray11);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray9, (int) (short) 1, (int) (byte) 100);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (long) (short) 1);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray17);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray17);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.subarray(longArray19, (int) (short) 0, 5);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray19, (long) '4');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[32]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[32]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[32, 1]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[32, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[32, 32, 1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[32, 32, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.Boolean[][][][] booleanArray0 = new java.lang.Boolean[][][][] {};
        java.lang.Boolean[][][][] booleanArray3 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray0, (int) (byte) 0, 8);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray20);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.clone(byteArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray23);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray30 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray30, (byte) -1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray32);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.add(byteArray32, (byte) 100);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray25, byteArray35);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray42, (byte) 0);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray25, byteArray42);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.clone(byteArray42);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray23, byteArray42);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray47);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100, 0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, ' ');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray5, (java.lang.Object) "{}");
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray5, ' ');
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, '4', 7);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Character[] charArray14 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray8, (java.lang.Object) charArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray0, (java.lang.Object[]) byteArray8);
        java.lang.Byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap21 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) byteArray0);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        java.lang.Double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray22);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray22);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray0, (java.lang.Object) doubleArray22);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(objMap21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, false);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray22);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (int) '#');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray3, (long) (short) 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray13, (long) (short) 1);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray13, (int) (short) 100, 8);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray18, (long) (byte) 100, 0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[10, 100, 35, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 10, 1);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray18, (byte) 0);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.add(byteArray18, (byte) 10);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray28 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray28, (byte) -1);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray30);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.add(byteArray30, (byte) 100);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray23, byteArray33);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray18, byteArray33);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.clone(byteArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray12, byteArray36);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.clone(byteArray36);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray2);
        long[] longArray5 = new long[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray5);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray7);
        long[] longArray11 = new long[] { 100L, 'a' };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray11, (int) (short) 10, 100);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray14);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray14, (long) 0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray7, longArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray3, (java.lang.Object) longArray7);
        java.lang.String[] strArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        boolean[] booleanArray26 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.add(booleanArray26, true);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray26);
        boolean[] booleanArray35 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.add(booleanArray35, true);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray35);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray35, false);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray35);
        java.lang.Boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray35);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray26, booleanArray35);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) booleanArray43, (int) (short) -1);
        java.lang.String[] strArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap47 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, 'hi!', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[32]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[32]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, false, true, true, false, false, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strArray46);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray18);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray18, true);
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
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false, true, true]");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        java.lang.Byte[] byteArray14 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray14, (byte) -1);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray16);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 100);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray16);
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray16);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) 0);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 10);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray37 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray37, (byte) -1);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray39);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.add(byteArray39, (byte) 100);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray32, byteArray42);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray27, byteArray42);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(byteArray27, (byte) 10);
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray27, 0, (int) (byte) 1);
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray16, byteArray27);
        java.lang.Byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray50);
        byte[] byteArray54 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray50, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1, -1, -1, 1, 0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray9, (float) 0);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray11, (-1.0f), 100);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray11);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(floatArray15, (float) (byte) 1);
        java.lang.Float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray15);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray19);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0, 1.0]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) 4, (int) '4');
        long[] longArray15 = new long[] { 10L, 100L, '#' };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray15);
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray15);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toObject(longArray15);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19);
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19, (long) 5);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[10, 100, 35]");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) '#');
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        char[] charArray0 = null;
        java.lang.Character[] charArray1 = new java.lang.Character[] {};
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2, ' ');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.subarray(charArray5, (int) (short) 0, (int) (short) 1);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray5);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray5, 'a');
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray11, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.clone(charArray11);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, false);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.add(booleanArray18, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.add(booleanArray18, 9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, true, false, true, true]");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.Integer[][][][][] intArray0 = new java.lang.Integer[][][][][] {};
        java.lang.Integer[][][][][] intArray1 = new java.lang.Integer[][][][][] {};
        java.lang.Integer[][][][][][] intArray2 = new java.lang.Integer[][][][][][] { intArray0, intArray1 };
        java.lang.Integer[][][][][] intArray3 = new java.lang.Integer[][][][][] {};
        java.lang.Integer[][][][][] intArray4 = new java.lang.Integer[][][][][] {};
        java.lang.Integer[][][][][][] intArray5 = new java.lang.Integer[][][][][][] { intArray3, intArray4 };
        java.lang.Integer[][][][][] intArray6 = new java.lang.Integer[][][][][] {};
        java.lang.Integer[][][][][] intArray7 = new java.lang.Integer[][][][][] {};
        java.lang.Integer[][][][][][] intArray8 = new java.lang.Integer[][][][][][] { intArray6, intArray7 };
        java.lang.Integer[][][][][] intArray9 = new java.lang.Integer[][][][][] {};
        java.lang.Integer[][][][][] intArray10 = new java.lang.Integer[][][][][] {};
        java.lang.Integer[][][][][][] intArray11 = new java.lang.Integer[][][][][][] { intArray9, intArray10 };
        java.lang.Integer[][][][][][][] intArray12 = new java.lang.Integer[][][][][][][] { intArray2, intArray5, intArray8, intArray11 };
        java.lang.Integer[][][][][][][] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray12);
        java.lang.Integer[][][][] intArray15 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray16 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray17 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray18 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][][] intArray19 = new java.lang.Integer[][][][][] { intArray15, intArray16, intArray17, intArray18 };
        java.lang.Integer[][][][] intArray20 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray21 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray22 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray23 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][][] intArray24 = new java.lang.Integer[][][][][] { intArray20, intArray21, intArray22, intArray23 };
        java.lang.Integer[][][][] intArray25 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray26 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray27 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray28 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][][] intArray29 = new java.lang.Integer[][][][][] { intArray25, intArray26, intArray27, intArray28 };
        java.lang.Integer[][][][] intArray30 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray31 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray32 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray33 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][][] intArray34 = new java.lang.Integer[][][][][] { intArray30, intArray31, intArray32, intArray33 };
        java.lang.Integer[][][][] intArray35 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray36 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray37 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray38 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][][] intArray39 = new java.lang.Integer[][][][][] { intArray35, intArray36, intArray37, intArray38 };
        java.lang.Integer[][][][] intArray40 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray41 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray42 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][] intArray43 = new java.lang.Integer[][][][] {};
        java.lang.Integer[][][][][] intArray44 = new java.lang.Integer[][][][][] { intArray40, intArray41, intArray42, intArray43 };
        java.lang.Integer[][][][][][] intArray45 = new java.lang.Integer[][][][][][] { intArray19, intArray24, intArray29, intArray34, intArray39, intArray44 };
        java.lang.Integer[][][][][][] intArray48 = org.apache.commons.lang3.ArrayUtils.subarray(intArray45, 5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer[][][][][][][] intArray49 = org.apache.commons.lang3.ArrayUtils.add(intArray12, (int) 'a', intArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray48);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        boolean[] booleanArray12 = new boolean[] { false, true, true, false };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true, 10);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, false);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        java.lang.Object[] objArray19 = new java.lang.Object[] { charArray7, booleanArray12 };
        double[] doubleArray23 = new double[] { (short) 100, 1, (-1.0d) };
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) 0.0f, (int) (short) 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, 0.0d, 10);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) (byte) 10);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray23, (double) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass35 = doubleArray23.getClass();
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray7, (java.lang.Object) wildcardClass35, 0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charArray7);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[4, a,  , a, 4], [false, true, true, false]]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4, a,  , a, 4]");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray29, (float) (byte) -1);
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
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[1.0, -1.0, -1.0, 1.0]");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils1 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils2 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray3 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils0, arrayUtils1, arrayUtils2 };
        org.apache.commons.lang3.ArrayUtils arrayUtils4 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils5 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils6 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray7 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils4, arrayUtils5, arrayUtils6 };
        org.apache.commons.lang3.ArrayUtils arrayUtils8 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils9 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils10 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray11 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils8, arrayUtils9, arrayUtils10 };
        org.apache.commons.lang3.ArrayUtils arrayUtils12 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils13 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils14 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray15 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils12, arrayUtils13, arrayUtils14 };
        org.apache.commons.lang3.ArrayUtils arrayUtils16 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils17 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils18 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray19 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils16, arrayUtils17, arrayUtils18 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray20 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray3, arrayUtilsArray7, arrayUtilsArray11, arrayUtilsArray15, arrayUtilsArray19 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray23 = org.apache.commons.lang3.ArrayUtils.subarray(arrayUtilsArray20, (int) ' ', 1);
        double[] doubleArray25 = new double[] { 2 };
        double[] doubleArray27 = new double[] { 2 };
        double[] doubleArray29 = new double[] { 2 };
        double[] doubleArray31 = new double[] { 2 };
        double[] doubleArray33 = new double[] { 2 };
        double[] doubleArray35 = new double[] { 2 };
        double[][] doubleArray36 = new double[][] { doubleArray25, doubleArray27, doubleArray29, doubleArray31, doubleArray33, doubleArray35 };
        double[][] doubleArray37 = org.apache.commons.lang3.ArrayUtils.toArray(doubleArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) arrayUtilsArray20, (java.lang.Object[]) doubleArray37);
        org.junit.Assert.assertNotNull(arrayUtilsArray3);
        org.junit.Assert.assertNotNull(arrayUtilsArray7);
        org.junit.Assert.assertNotNull(arrayUtilsArray11);
        org.junit.Assert.assertNotNull(arrayUtilsArray15);
        org.junit.Assert.assertNotNull(arrayUtilsArray19);
        org.junit.Assert.assertNotNull(arrayUtilsArray20);
        org.junit.Assert.assertNotNull(arrayUtilsArray23);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[2.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[2.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[2.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[2.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[2.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[2.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray20);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.remove(byteArray5, 0);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray24);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils1 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils2 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray3 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils0, arrayUtils1, arrayUtils2 };
        org.apache.commons.lang3.ArrayUtils arrayUtils4 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils5 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils6 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray7 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils4, arrayUtils5, arrayUtils6 };
        org.apache.commons.lang3.ArrayUtils arrayUtils8 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils9 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils10 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray11 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils8, arrayUtils9, arrayUtils10 };
        org.apache.commons.lang3.ArrayUtils arrayUtils12 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils13 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils14 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray15 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils12, arrayUtils13, arrayUtils14 };
        org.apache.commons.lang3.ArrayUtils arrayUtils16 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils17 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils18 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray19 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils16, arrayUtils17, arrayUtils18 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray20 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray3, arrayUtilsArray7, arrayUtilsArray11, arrayUtilsArray15, arrayUtilsArray19 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray23 = org.apache.commons.lang3.ArrayUtils.subarray(arrayUtilsArray20, (int) ' ', 1);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(arrayUtilsArray20);
        org.junit.Assert.assertNotNull(arrayUtilsArray3);
        org.junit.Assert.assertNotNull(arrayUtilsArray7);
        org.junit.Assert.assertNotNull(arrayUtilsArray11);
        org.junit.Assert.assertNotNull(arrayUtilsArray15);
        org.junit.Assert.assertNotNull(arrayUtilsArray19);
        org.junit.Assert.assertNotNull(arrayUtilsArray20);
        org.junit.Assert.assertNotNull(arrayUtilsArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) ' ');
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (short) 100, 4);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 100);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) 10);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) (byte) -1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, 2, (int) (short) -1);
        java.lang.Short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray9, true);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(longArray2, (long) (short) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray2, (long) ' ', (-1));
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray2, 1L);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray12);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[100, 97, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        boolean[] booleanArray5 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray6 = new boolean[][] { booleanArray5 };
        boolean[] booleanArray12 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray13 = new boolean[][] { booleanArray12 };
        boolean[] booleanArray19 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray20 = new boolean[][] { booleanArray19 };
        boolean[] booleanArray26 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray27 = new boolean[][] { booleanArray26 };
        boolean[][][] booleanArray28 = new boolean[][][] { booleanArray6, booleanArray13, booleanArray20, booleanArray27 };
        boolean[] booleanArray34 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray35 = new boolean[][] { booleanArray34 };
        boolean[] booleanArray41 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray42 = new boolean[][] { booleanArray41 };
        boolean[] booleanArray48 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray49 = new boolean[][] { booleanArray48 };
        boolean[] booleanArray55 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray56 = new boolean[][] { booleanArray55 };
        boolean[][][] booleanArray57 = new boolean[][][] { booleanArray35, booleanArray42, booleanArray49, booleanArray56 };
        boolean[] booleanArray63 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray64 = new boolean[][] { booleanArray63 };
        boolean[] booleanArray70 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray71 = new boolean[][] { booleanArray70 };
        boolean[] booleanArray77 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray78 = new boolean[][] { booleanArray77 };
        boolean[] booleanArray84 = new boolean[] { true, false, true, true, false };
        boolean[][] booleanArray85 = new boolean[][] { booleanArray84 };
        boolean[][][] booleanArray86 = new boolean[][][] { booleanArray64, booleanArray71, booleanArray78, booleanArray85 };
        boolean[][][][] booleanArray87 = new boolean[][][][] { booleanArray28, booleanArray57, booleanArray86 };
        boolean boolean88 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray87);
        boolean boolean89 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray87);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertNotNull(booleanArray57);
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertNotNull(booleanArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray70), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray71);
        org.junit.Assert.assertNotNull(booleanArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray77), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray78);
        org.junit.Assert.assertNotNull(booleanArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray84), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray85);
        org.junit.Assert.assertNotNull(booleanArray86);
        org.junit.Assert.assertNotNull(booleanArray87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray0);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 4, 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 1L, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        long[] longArray1 = new long[] { 1L };
        long[][] longArray2 = new long[][] { longArray1 };
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        long[][] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, '#');
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a', (int) (byte) 0);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, 'a');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray9);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(charArray9, '4');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9, (long) (byte) 10);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 10, 1);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0, 2);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) 0, 0);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) 0);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray24);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 1, 100, 100, 0, 0, 1, 100, 100, 0]");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, 1.0]");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Character[] charArray14 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray8, (java.lang.Object) charArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray0, (java.lang.Object[]) byteArray8);
        java.lang.Byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 1);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.remove(byteArray20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (int) (short) 10, 4);
        long[] longArray15 = new long[] { 100L, 'a' };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, (int) (short) 10, 100);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray18, (long) ' ');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray18);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray8);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) 1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 100);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray3, 1, 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 0, (int) (byte) 100);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 0);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 100);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        float[] floatArray24 = new float[] { (-1L), (byte) 1 };
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray24, (float) (byte) 10);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) (short) 1);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.add(floatArray28, 0.0f);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(floatArray30, (float) (short) 0);
        float[] floatArray35 = new float[] { (-1L), (byte) 1 };
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray35, (float) (byte) 10);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.add(floatArray35, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray41 = org.apache.commons.lang3.ArrayUtils.clone(floatArray40);
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray40, (int) '#', (int) 'a');
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.remove(floatArray40, (int) (byte) 0);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray40, (float) 10);
        float[] floatArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray40);
        float[] floatArray52 = new float[] { (-1L), (byte) 1 };
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray52, (float) (byte) 10);
        float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.add(floatArray52, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray58 = org.apache.commons.lang3.ArrayUtils.clone(floatArray57);
        float[] floatArray61 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray57, (int) '#', (int) 'a');
        float[] floatArray63 = org.apache.commons.lang3.ArrayUtils.remove(floatArray57, (int) (byte) 0);
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray57, (float) 10);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray49, floatArray57);
        float[] floatArray67 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray30, floatArray57);
        float[] floatArray68 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray67);
        float[] floatArray69 = org.apache.commons.lang3.ArrayUtils.clone(floatArray68);
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
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0, 1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[-1.0, 1.0, 1.0, 0.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[-1.0, -1.0, 1.0, -1.0, 1.0, 1.0, 0.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[-1.0, -1.0, 1.0, -1.0, 1.0, 1.0, 0.0, -1.0, -1.0, 1.0]");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 1, (int) (byte) 10);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray1, (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray1);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray8);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.clone(byteArray9);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray16, (byte) 0);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(byteArray16, (byte) 100);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, 100, 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray16, (byte) 0, 0);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray16);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray16);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray28, (byte) 1);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.add(byteArray28, (byte) 100);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray32);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 1, 100, 100, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 1, 100, 100, 0, 100]");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap3 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) booleanArray0);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(objMap3);
        org.junit.Assert.assertNotNull(booleanArray4);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray29);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray29);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray29);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray29);
        java.lang.Float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray29);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray35, 100.0f);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray35, (float) '4');
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray35);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[1.0, -1.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[1.0, -1.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[1.0, -1.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[1.0, -1.0, -1.0, 1.0, -1.0]");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Long[] longArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray4, (java.lang.Object) longArray6, (int) (short) 100);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) 5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray5, (long) 3, (int) (byte) 10);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) 2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[2]");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Character[] charArray14 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray8, (java.lang.Object) charArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray0, (java.lang.Object[]) byteArray8);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0, (byte) 1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(byteArray20, (byte) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 10);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) (short) 1);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.clone(floatArray19);
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
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) (short) 0, (int) (byte) 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 10, 0);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        java.lang.Float[] floatArray22 = new java.lang.Float[] { 100.0f };
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray22, (float) (short) -1);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.clone(floatArray24);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray25);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) '#');
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) (short) 10, (int) '4');
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) ' ', (double) 6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray10, (int) (short) 0, (long) 1);
        java.lang.Long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toObject(longArray13);
        java.lang.Object[] objArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) longArray14);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1]");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray27, (int) '4', (int) (byte) 1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, 0, (double) ' ');
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray27);
        java.lang.Double[] doubleArray39 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray39);
        java.lang.Long[] longArray41 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray39, (java.lang.Object) longArray41, (int) (short) 100);
        java.lang.Double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray39);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray39);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray39, (double) 100.0f);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray34, doubleArray47);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray48, (double) 100L, (int) (short) 100, (double) '#');
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray48, (double) 9, (double) ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.Comparable[][][][] comparableArray1 = new java.lang.Comparable[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][][][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][][][]) comparableArray1;
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(strComparableArray2);
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertNotNull(strComparableArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, false);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true, (int) (short) 0);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, true, true, false]");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, (int) (short) 100, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray2);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray2, (int) 'a');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray2);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, 0, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(wildcardClassArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.lang.reflect.GenericDeclaration[]) wildcardClassArray0);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ArrayUtils.subarray(wildcardClassArray0, 2, 9);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(shortArray11, (short) 10);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray19, (short) 0);
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray19, shortArray26);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray27, (short) (byte) 1);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray27, (short) 0);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.add(shortArray27, 2, (short) (byte) 10);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray11, shortArray34);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[-1, 100, 10, 1, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) -1 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, -1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, -1]");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.Object obj0 = null;
        double[] doubleArray4 = new double[] { (short) 100, 1, (-1.0d) };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 0.0f, (int) (short) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, 0.0d, 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (byte) 10);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) '4', (int) (short) 10);
        double[] doubleArray19 = new double[] { (short) 100, 1, (-1.0d) };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) 0.0f, (int) (short) 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, 0.0d, 10);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) (byte) 10);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray19);
        java.lang.Double[] doubleArray33 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray33);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray33, 0.0d);
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray33);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray28, doubleArray37);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray38, (double) (short) 1, (int) '#', 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameType(obj0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        double[] doubleArray0 = null;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (-1));
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray3);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray8);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) ' ', (int) '#');
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray9, 'a');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #]");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray20);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray5);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray24);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray24);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray24, (byte) 0);
        java.lang.Byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray24);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray24);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.add(byteArray30, 0, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 0, 1, 100, 100, 0]");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (-1));
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray3, (long) (short) 0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 100, 35]");
    }
}

